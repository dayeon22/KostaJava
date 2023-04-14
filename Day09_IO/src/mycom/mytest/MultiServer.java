package mycom.mytest;
import java.net.*;
import java.io.*;
public class  MultiServer{
  ServerSocket server;   //���� ����
  Socket child;           //Ŭ���̾�Ʈ�� ����ϱ� ���� ����

  //�����ڴ� ������ ��Ʈ ��ȣ�� ���� ���� 
  public MultiServer(int port) {
    try{
      //1. ���� ���� ���α׷��� ��Ʈ�� �����ؼ� ���� ���� �������� �Ѵ�. 
      server = new ServerSocket(port);
    }catch(Exception e){    //���� ���� ������ �����ϸ�
      e.printStackTrace();  //���� �޽����� ����ϰ�
      System.exit(0);       //���α׷��� �����Ѵ�. 
    }

    //2. Ŭ���̾�Ʈ�� ������ �׻� �޾Ƶ��� �� �ֵ��� ���ѷ����� ����
    System.out.println("**** ä�� ����*****");
    System.out.println("192.168.0.27");
    System.out.println("������ Ŭ���̾�Ʈ ������ ���� ��û�� ��ٸ��� ����");

    while(true){
        try{
        //Ŭ���̾�Ʈ�� ��û�� ������ ��� ���¿� �� 
        //Ŭ���̾�Ʈ�� �����ϴ� ���� Ŭ���̾�Ʈ�� ����� �� �ִ� ������ ��ȯ��
        child = server.accept( );
//****************************************************************************************
        //������ ��� �����ϸ鼭 ������ �ۼ��� �ϱ� ���ؼ� ������ ��ü ����
        EchoServerThread childThread=new EchoServerThread(child);
        Thread t = new Thread(childThread);
        t.start();
//****************************************************************************************
      }catch(Exception e){ 
      e.printStackTrace();  //���� �޽����� ����ϰ�
      System.exit(0);       //���α׷��� �����Ѵ�. 
      }
    }//while ��
  }//������ ��
  public static void main(String[] args)  {
    new MultiServer(5000);//��Ʈ ��ȣ 5000�� �����Ѵ�. 
  }//main�� 
}//ChatServerEx
//****************************************************************************************
//������ ��� �����ϸ鼭 ������ �ۼ��� �ϱ� ���ؼ� ������ Ŭ���� ����
class EchoServerThread implements Runnable{
  Socket child;          //Ŭ���̾�Ʈ�� ����ϱ� ���� ����

  InputStream is;        //Ŭ���̾�Ʈ�� ����� �Է� ��Ʈ�� ����
  ObjectInputStream ois; //Ŭ���̾�Ʈ�κ��� �����͸� ���۹ޱ� ���� ��Ʈ��
 
  OutputStream os;       //Ŭ���̾�Ʈ�� ����� ��� ��Ʈ�� ����
  ObjectOutputStream oos;//Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� ��Ʈ��

  String receiveData;    //Ŭ���̾�Ʈ�κ��� ���۹��� �����͸� �����ϱ� ���� ���� 
 
 //���� ��û�� ���� ��ü�� �����ڷ� ��������. 
  public EchoServerThread(Socket s){
    //Ŭ���̾�Ʈ�� ����� �� �ִ� ���� ������ child�� ������
    child=s;
    try{
        //3. ������ �Ǹ� Ŭ���̾�Ʈ�� ���� ������ �ּҸ� ��� ����� 
        System.out.println(child.getInetAddress()+"�� ���� �����û ����");

        //4. Ŭ���̾�Ʈ�� ���� ������ �����͸� ���� ���ؼ� Ŭ���̾�Ʈ�κ��� �Է� ��Ʈ���� ���� 
        is = child.getInputStream();
        //4-1. �Է� ��Ʈ���� ObjectInputStream���� ��ȯ�Ѵ�.
        ois = new ObjectInputStream(is);

        //5. Ŭ���̾�Ʈ�κ��� ���� �޽����� �ٽ� ������ ���ؼ� ��� ��Ʈ�� ����
        os = child.getOutputStream();
        //5_1. ��� ��Ʈ���� ObjectOutputStream���� ��ȯ�Ѵ�. 
        oos = new ObjectOutputStream(os);
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  public void run(){
    try{
    while(true){
        //4-2. ��Ʈ���� ���� �����͸� �о�� 
        receiveData = (String)ois.readObject();
        //4-3. ���� �����͸� Ȯ���ϱ� ���ؼ� ���� ȭ�鿡 ��� 
        System.out.println(child.getInetAddress()+"�� �޽���:"+receiveData);
      
        //5-2. Ŭ���̾�Ʈ�� ���� ���� �����͸� Ŭ���̾�Ʈ���� �ٽ� ������-> ����:�޾Ƹ�
        oos.writeObject(receiveData);
        oos.flush();            
      }
    }catch(Exception e){
      System.out.println("Ŭ���̾�Ʈ�� ���� ����");
    }
    finally{
      try{
        is.close();
        os.close();
        ois.close();
        oos.close();
        child.close();        
      }catch(IOException e2){
        e2.printStackTrace();
      }
    }
  }
};