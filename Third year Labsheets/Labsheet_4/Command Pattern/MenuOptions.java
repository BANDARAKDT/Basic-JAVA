<<<<<<< HEAD

public class MenuOptions {

	private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;
 
    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    public void clickOpen(){
       openCommand.execute();
    }
    public void clickSave(){
      saveCommand.execute();
    }

	
}
=======

public class MenuOptions {

	private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;
 
    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    public void clickOpen(){
       openCommand.execute();
    }
    public void clickSave(){
      saveCommand.execute();
    }

	
}
>>>>>>> 55b4b2b88cf0993fe4337f77c99d18f980368da9
