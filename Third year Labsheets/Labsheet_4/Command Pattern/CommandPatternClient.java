<<<<<<< HEAD

public class CommandPatternClient {
	
	
	public static void main(String[] args) {
        Document doc = new Document();
        
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        
        menu.clickOpen();
        menu.clickSave();
       
        
    }

}
=======

public class CommandPatternClient {
	
	
	public static void main(String[] args) {
        Document doc = new Document();
        
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        
        menu.clickOpen();
        menu.clickSave();
       
        
    }

}
>>>>>>> 55b4b2b88cf0993fe4337f77c99d18f980368da9
