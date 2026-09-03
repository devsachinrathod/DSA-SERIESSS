class JumpGame {

    public boolean canJump(int[] arr) {

        int maxReach = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + arr[i]);
        }

        return true;
    }

    public static void main(String[] args) {

        JumpGame s = new JumpGame();

        int[] arr = {2, 3, 1, 1, 4};

        System.out.println(s.canJump(arr));
    }
}