package imagebrowser;

public class Application {

    private ApplicationFrame frame;

    public static void main(String[] args) {
        new Application().execute();
    }

    private void execute() {
        frame = new ApplicationFrame();
        frame.setVisible(true);
    }

}
