package AbstractFactory;

public class AbstractFactoryMain {
    private static UIFactory getFactory(String theme){
        if(theme.equalsIgnoreCase("Light")){
            return new LightThemeFactory();
        } else if (theme.equalsIgnoreCase("Dark")) {
            return new DarkThemeFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        UIFactory uiFactory = getFactory("Light");
        Button button = uiFactory.createButton();
        TextField textField =uiFactory.createTextField();

        button.render();
        textField.render();

        uiFactory= getFactory("Dark");
        button = uiFactory.createButton();
        textField=uiFactory.createTextField();

        button.render();
        textField.render();
    }
}
