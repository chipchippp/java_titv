package code_presso;

public class Loop2 {
    public static void main(String[] args) {
        int[] gameScores = {85, 92, 78, 90, 88}; // Ví dụ: điểm số trong mảng

        int totalScore = 0;
        double averageScore;

        // Tính tổng điểm
        for (int score : gameScores) {
            totalScore += score;
        }

        // Tính điểm trung bình
        if (gameScores.length > 0) {
            averageScore = (double) totalScore / gameScores.length;
        } else {
            averageScore = 0.0; // Tránh chia cho 0 nếu mảng rỗng
        }

        // In kết quả
        System.out.println("Tổng điểm: " + totalScore);
        System.out.println("Điểm trung bình: " + averageScore);
    }
}
