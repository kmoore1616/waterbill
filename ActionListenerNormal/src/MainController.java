public class MainController {
    public static void main(String args[]){
        InClassView inClassView = new InClassView();
        InClassController inClassController = new InClassController(inClassView);
        inClassView.initUI();
    }
}
