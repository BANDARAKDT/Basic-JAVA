import javax.swing.text.Document;

public class ActionOpen implements ActionListenerCommand{

    private Document doc;

    public ActionOpen(Document doc){
        this.doc=doc;
    }


    public void exeute(){
        doc.open();
    }
    
}
