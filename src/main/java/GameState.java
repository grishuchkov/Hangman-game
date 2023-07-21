public class GameState {

    private final int MAX_COUNT_MISTAKES = 6;
    private int mistakes = 0;

    public void addMistake(){
        mistakes += 1;
    }

    public void printMistakesCount() {
        System.out.println("Количество ошибок: " + mistakes);
    }

    public boolean mistakesLimitReached(){
        return mistakes == MAX_COUNT_MISTAKES;
    }

    public void printGallows(){
        String gallowsState;
        switch (mistakes) {
            case 1 -> gallowsState = "=====================|\n" +
                    "  ||                 |\n" +
                    "  ||                (ツ)\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "==========================";
            case 2 -> gallowsState = "=====================|\n" +
                    "  ||                 |\n" +
                    "  ||                (ツ)\n" +
                    "  ||                 |\n" +
                    "  ||                 |\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "==========================";
            case 3 -> gallowsState = "=====================|\n" +
                    "  ||                 |\n" +
                    "  ||                (ツ)\n" +
                    "  ||                /|\n" +
                    "  ||                 |\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "==========================";
            case 4 -> gallowsState = "=====================|\n" +
                    "  ||                 |\n" +
                    "  ||                (ツ)\n" +
                    "  ||                /|\\\n" +
                    "  ||                 |\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "==========================";
            case 5 -> gallowsState = "=====================|\n" +
                    "  ||                 |\n" +
                    "  ||                (ツ)\n" +
                    "  ||                /|\\\n" +
                    "  ||                 |\n" +
                    "  ||                /\n" +
                    "  ||\n" +
                    "==========================";
            case 6 -> gallowsState = "=====================|\n" +
                    "  ||                 |\n" +
                    "  ||                (ツ)\n" +
                    "  ||                /|\\\n" +
                    "  ||                 |\n" +
                    "  ||                / \\\n" +
                    "  ||\n" +
                    "==========================";
            default -> gallowsState = "=====================|\n" +
                    "  ||                 |\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "==========================";
        }
        System.out.println(gallowsState);
    }


}
