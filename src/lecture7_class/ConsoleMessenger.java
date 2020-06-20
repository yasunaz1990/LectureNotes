package lecture7_class;

/**
 * @author Nijat Muhtar
 *
 * Creation Date: Sep 20, 2014
 * Last Modified: Aug 3, 2015
 * <p>
 * -----Class Description ------------------------------------|
 * This class offers text formatting for the text data that
 * will be displayed on the Terminal(Console). User this class to
 * enabled colorized Terminal messaging for your automated test
 * execution.
 * <p>
 * The recommended color usage guideline is as follows:
 * ----- EVENT------------------------:-----FORMAT----------|
 * - Debug information observance    :  WHITE_BOLD
 * - Log information observance      :  WHITE
 * - Warning information observance  :  YELLOW
 * - Page Object Creation            :  PURPLE
 * - Error or Blocker                :  RED
 * <p>
 * NOTE: Feel free to add your own utility methods.
 */
public class ConsoleMessenger {
    // **NOTE**:
    //    Each field value is final, the value is not
    //    allowed to be changed or modified. If you make
    //    any changes on its definition, please state
    //    your reason on your commit message.
    // *******

    // ------------------ STATIC FIELDS --------------- //

    // ----- Reset the format ------ //
    private static final String RESET = "\033[0m";  // Text Reset

    // ----- Regular Colors ------ //
    private static final String BLACK = "\033[0;30m";   // BLACK
    private static final String RED = "\033[0;31m";     // RED
    private static final String GREEN = "\033[0;32m";   // GREEN
    private static final String YELLOW = "\033[0;33m";  // YELLOW
    private static final String BLUE = "\033[0;34m";    // BLUE
    private static final String PURPLE = "\033[0;35m";  // PURPLE
    private static final String CYAN = "\033[0;36m";    // CYAN
    private static final String WHITE = "\033[0;37m";   // WHITE

    // ----- Bold ------ //
    private static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    private static final String RED_BOLD = "\033[1;31m";    // RED
    private static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    private static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    private static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    private static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    private static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    private static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // ----- Underline ------ //
    private static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    private static final String RED_UNDERLINED = "\033[4;31m";    // RED
    private static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    private static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    private static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    private static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    private static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    private static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // ----- Background  ------ //
    private static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    private static final String RED_BACKGROUND = "\033[41m";    // RED
    private static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    private static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    private static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    private static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    private static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    private static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // ----- High Intensity ------ //
    private static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    private static final String RED_BRIGHT = "\033[0;91m";    // RED
    private static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    private static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    private static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    private static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    private static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    private static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // ----- Bold High Intensity ------ //
    private static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    private static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    private static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    private static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    private static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    private static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    private static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    private static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // ----- High Intensity backgrounds ------ //
    private static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    private static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    private static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    private static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    private static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    private static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    private static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    private static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE


    // ----- BLOCK Symbols for the Progress ------//
    private static final String progressBlock = "░";
    private static final String progressBlockBold = "█";
    private static final String lineBar = "▬";


    // ------------------ STATIC METHODS --------------- //


    /**
     * Displyas formatted ( WHITE BOLD ) text data to the
     * console. Use this to display debug info
     *
     * @param message
     */
    public static void debug(String message) {
        System.out.println(WHITE_BOLD + message + RESET);
    }

    /**
     * Displyas formatted ( WHITE ) text data to the
     * console. Use this to display test step log info
     *
     * @param message
     */
    public static void log(String message) {
        System.out.println(WHITE + message + RESET);
    }

    /**
     * Displyas formatted ( YELLOW ) text data to the
     * console. Use this to display warning info
     *
     * @param message
     */
    public static void warning(String message) {
        System.out.println(YELLOW + message + RESET);
    }

    /**
     * Displyas formatted ( PURPLE ) text data to the
     * console.Use this to display page object creation info
     *
     * @param message
     */
    public static void pobCreation(String message) {
        System.out.println(PURPLE + message + RESET);
    }


    /**
     * Displyas formatted ( RED ) text data to the
     * console. Use this to display blocker info
     *
     * @param message
     */
    public static void bocker(String message) {
        System.out.println(RED + message + RESET);
    }


    /**
     * Displays number of blocks specified by the parameter with title text
     * @param blockCount
     * @param title
     */
    public static void displayBlocks(int blockCount, String title) {
        if(blockCount < 0) {
            throw new IllegalArgumentException("Negative block count is not allowed");
        }
        String block = progressBlock;
        for(int i = 0; i < blockCount; i++) {
            block += progressBlock;
        }
        String formattedTitle = WHITE_BOLD + title + RESET;
        String base = "";
        if(blockCount < 10){
            base = blockCount + "  ";
        }
        else if(blockCount < 100) {
            base = blockCount + " ";
        }
        else if(blockCount < 1000) {
            base = blockCount + "";
        }
        System.out.println(base + block +  " " + formattedTitle);
    }

    /**
     * Displays number of bold blocks specified the parameter with title text
     * @param blockCount
     * @param title
     */
    public static void displayBoldBlocks(int blockCount, String title) {
        if(blockCount < 0) {
            throw new IllegalArgumentException("Negative block count is not allowed");
        }
        String block = progressBlockBold;
        for(int i = 0; i < blockCount; i++) {
            block += progressBlockBold;
        }
        String formattedTitle = YELLOW_BOLD + title + RESET;
        //block = RED + block + RESET;
        String base = "";
        if(blockCount < 10){
            base = blockCount + "  ";
        }
        else if(blockCount < 100) {
            base = blockCount + " ";
        }
        else if(blockCount < 1000) {
            base = blockCount + "";
        }
        System.out.println(base + block +  " " + formattedTitle);
    }

    /**
     * Displays line bar enclosing title string
     * @param lineCount
     * @param title
     */
    public static void displayTitleBar(int lineCount, String title) {
        String line = "";
        for(int i = 0; i < lineCount; i++)
            line += lineBar;

        line += " " + title.toUpperCase() +" ";

        for(int i = 0; i < lineCount; i++)
            line += lineBar;
        System.out.println(line);
    }

    /**
     *  Displays line bar
     * @param lineCount
     */
    public static void displayBar(int lineCount) {
        String line = "";
        for(int i = 0; i < lineCount; i++)
            line += lineBar;
        System.out.println(line);
    }
}
