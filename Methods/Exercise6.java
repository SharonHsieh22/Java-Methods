class Exercise6 {
    public static void main(String[] args) {
        displayBox(6, 3);
    }

    public static void displayBox(int width, int height) {
        for(int h = 0; h < height; h++) {
            for(int w = 0; w < width; w++) {
                System.out.print("$");
            }
            System.out.println("");
        }
    }
}