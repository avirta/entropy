 import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HelloWorld extends Frame {
FileDialog dialogLoad;
    public static void main (String [] argv){
	HelloWorld h = new HelloWorld();
    }

    TextField surname;
    public class Listener1 implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
		surname.setText("енко");
		//System.exit(0);
	    }
   }

Frame myWindow;
    public HelloWorld(){
	setTitle("Hello World!");		
	setSize(800, 600);
        GridLayout grid1= new GridLayout(8,4);// кількість стовбців, кількість рядків
        setLayout(grid1);
	
        add(new Label("Завантажити вихідний ряд"));
	Button BtDownload = new Button("Обзор");
        add(BtDownload );


        add(new Label("Розмір вікна"));
	TextField znachennya=new TextField("250");
        add(znachennya);
	//Button BtName = new Button("SetSurname  ");
        //add(BtName);

        add(new Label("Діапазон зміни стану[0,S], S="));
        TextField Diapazon=new TextField("3");
        add(Diapazon);
        //	Button BtFathersName = new Button("SetSurname  ");
        //add(BtFathersName);
        add(new Label("Кількість станів, k"));
        TextField Sostoyanie=new TextField("6");
        add(Sostoyanie);
      
	Button BtResult = new Button("Порахувати ентропію");
        add(BtResult);

	Panel hello = new Panel();
	add("Center", hello);
        myWindow=this;
        
	BtDownload.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		dialogLoad = new FileDialog(myWindow, "Вибір файла", FileDialog.LOAD);
		dialogLoad.show();
		String s = dialogLoad.getFile();

		//System.exit(0);
	   }
	});

	setVisible(true);
	//grid1.setRows(6);
	//grid1.setColumns(6);


	addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent e){ 
