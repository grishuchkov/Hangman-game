import java.util.Scanner;

public class Game {
    private final Dictionary dictionary = new Dictionary();

    public void startGame() {
        while (true) {
            menu();
            gameLoop();
        }
    }

    private void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Для начала игры напишите 'Старт', для выхода – 'Стоп'");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("старт")) {
                break;
            }
            if (input.equalsIgnoreCase("стоп")) {
                System.exit(0);
            } else {
                System.out.println("Пожалуйста, попробуйте снова");
            }
        }
    }

    private void gameLoop() {
        Scanner scanner = new Scanner(System.in);

        String wordFromDictionary = dictionary.getRandomWord();
        Word gameWord = new Word(wordFromDictionary);
        GameState gameState = new GameState();

        gameWord.printWordMask();

        while (!gameState.mistakesLimitReached() && !gameWord.wordIsOpen()) {
            System.out.println("Введите букву: ");
            String letter = scanner.nextLine();

            if (gameWord.letterEnteredBefore(letter)) {
                System.out.println("Вы уже вводили эту букву,введите другую.");
                continue;
            }
            if (!gameWord.isCorrectLetter(letter)) {
                System.out.println("Некорректная буква");
                continue;
            }
            if (!gameWord.haveLetter(letter)) {
                System.out.println("Такой буквы нет");
                gameState.addMistake();
            }

            gameState.printGallows();
            gameWord.printWordMask();
            gameState.printMistakesCount();
        }

        if (gameState.mistakesLimitReached()) {
            System.out.println("Вы проиграли, слишком много ошибок.");
        }
        if (gameWord.wordIsOpen()) {
            System.out.println("Вы выиграли, поздравляем!");
        }

        gameWord.printWordMeaning();
        System.out.println("=============================");
        System.out.println();
    }

}
