	package Student_Manage;
	
	//ѧ����½��Ľ���
	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;/*ArrayList;
	import java.util.Hashtable;
	*/
public  class StudentLogin extends JFrame implements  ActionListener{
		
		Function fun=new Function();		
		//������� 
		JLabel lb1=new JLabel("��ǰ��ѧ����¼����" );//JLabel ���������ʾ�ı���ͼ��
		JLabel lb2=new JLabel("��ʾ��¼��ǰ��������ѧ�ţ��޸ġ�ɾ������ѧ���޸���Ϣ");
	    JTextField ѧ��,����,����,�绰����,��ͥסַ,����;//����ѧ��������Ϣ���ı�
	    JRadioButton ��,Ů;//������ѡ������Ա�ѡ��
	    ButtonGroup group=null;//������ť��
	    JButton ¼��,��ѯ,ɾ��,�޸�,��ʾ,����;//������Ӧ�Ĳ����İ�ť
	    JPanel p1,p2,p3,p4,p5,p6,p7,pv,ph,pb;//���ڲ��ֵ�ͨ��
	    
	    student_information stu=new student_information();
	    ArrayList<student_information> arry=new ArrayList<>();
	    
	    public StudentLogin(){       //�������Ա��¼��������
	        super("����ʦ����ѧѧ��������Ϣ�ϱ�����ϵͳ");
	        ѧ��=new JTextField(10);//�����ı���Ϣ�ĵĶ���
	        ����=new JTextField(10);
	        �绰����=new JTextField(15);
	        ����=new JTextField(5);
	        ��ͥסַ=new JTextField(15);
	        ����=new JTextField(5);
	        
	        group=new ButtonGroup();
	        ��=new JRadioButton("��");//��ʼ����ѡ��,
	        Ů=new JRadioButton("Ů");
	        group.add(��);//�Ѱ�ť��ӵ���ť��
	        group.add(Ů);
	        //¼��=new JButton("����ѧ����Ϣ");//������ť����
	        ��ѯ=new JButton("��ѯĳ��ѧ����Ϣ");
	        //ɾ��=new JButton("ɾ��ѧ����Ϣ");
	       // �޸�.setEnabled(false);   //�����޸Ŀؼ�������
	        //�޸�=new JButton("�޸�ѧ����Ϣ"); 
	        ��ʾ=new JButton("��ʾȫ��ѧ����Ϣ");
	        ����=new JButton("���ص�¼����");
	    
	        pb=new JPanel();
	        pb.add(lb1,JLabel.CENTER);
	                
	        p1=new JPanel();//����һ�����     
	        //p1.setLayout(new GridLayout(3,0));
	        p1.add(lb2,JLabel.CENTER);
	        p1.add(new JLabel("ѧ��:",JLabel.CENTER));//JLabel.CENTER��ָJLabel�����ĵ㡣CENTER�����ĵ������
	        p1.add(ѧ��);
	        
	        p2=new JPanel();
	        p2.add(new JLabel("����:",JLabel.CENTER));
	        p2.add(����);
	        p3=new JPanel();
	        p3.add(new JLabel("�Ա�:",JLabel.CENTER));
	        p3.add(��);
	        p3.add(Ů);
	        p4=new JPanel();
	        p4.add(new JLabel("����:",JLabel.CENTER));
	        p4.add(����);
	        p5=new JPanel();
	        p5.add(new JLabel("�绰����:",JLabel.CENTER));
	        p5.add(�绰����);    
	        p6=new JPanel();
	        p6.add(new JLabel("��ͥסַ:",JLabel.CENTER));
	        p6.add(��ͥסַ);
	        p7=new JPanel();
	        p7.add(new JLabel("����:",JLabel.CENTER));
	        p7.add(����);
	       
	        pv=new JPanel();//���
	        pv.setLayout(new GridLayout(7,1));   //��pv������óɵ�����1�е����񲼾�
	            
	        pv.add(p1);//�����ŵ�������,add()��������
	        pv.add(p2);
	        pv.add(p3);
	        pv.add(p4);
	        pv.add(p5);
	        pv.add(p6);
	        pv.add(p7);
	               
	        ph=new JPanel();      
	       // ph.add(¼��);
	        ph.add(��ѯ);
	       // ph.add(�޸�);
	       // ph.add(ɾ��);    
	        ph.add(��ʾ);
	        ph.add(����);
	               
	        Container con=getContentPane();//������������con,ȡ���������
	        con.setLayout(new BorderLayout());//���ò���Ϊ�߿򲼾֣��߿򲼾ֶַ���������5����λ����ӿؼ���
	        //��û��ָ����λ������ӵ��м䣬�������Ҷ�������չ
	        con.add(pb, BorderLayout.NORTH);//Frame����lb���÷���add����,lb������Ϸ�     
	        con.add(pv, BorderLayout.CENTER);//pv���м�
	        con.add(ph, BorderLayout.SOUTH);//ph���ϱ�
	        setDefaultCloseOperation(EXIT_ON_CLOSE);//��һ��Ĭ�ϵĹرղ�����Ҳ�������JFrame���ڵĹرհ�ť�������ʱ���˳�����
	        setBounds(100,100,900,450);//setBounds(x,y,width,height); x:���������X���ϵ���� y:���������Y���ϵ���� width:����ĳ��� height:����ĸ߶�
	        setVisible(true);//Ŀ����ʹ�ؼ�������ʾ����,����ÿؼ��Ѿ�����ʾ����
	          
	        //��Ӽ���        
	       //��ʾȫ��ѧ����Ϣ
	          ��ʾ.addActionListener(new ActionListener() {
	     	   public void actionPerformed(ActionEvent e) {     		   
	     		  new show_stuall();   	
	     		   
	     	    }	     		   
	          });
	          
	          //��ѯĳ��ѧ����Ϣ       
	          ��ѯ.addActionListener(new ActionListener() {
	          	   public void actionPerformed(ActionEvent e) {      		  
	          		   String sID = ѧ��.getText();    //��ȡ�ı��������� 
	          		   if(sID.equals(""))
	          		     sID="--";       		   
	            		  String sname = ����.getText();  		 
	            		  if(sname.equals(""))
	          			   sname="--";      		 	 
	              	  String sage = ����.getText();     		 
	              	  if(sage.equals(""))             //����Ϊ�գ�û������
	           			    sage="--";  		 
	              	  String scall = �绰����.getText();
	              	 if(scall.equals(""))
	              			  scall="--";
	              		 String shome = ��ͥסַ.getText();
	              		if(shome.equals(""))
	              		    shome="--";
	              		 String siden = ����.getText();
	              		if(siden.equals(""))
	              		   siden="--";
	              		 String ssex=null;
	              		if(��.isSelected()){//ѡ����Ů
	                        ssex=��.getText();
	                     }
	                     else {
	                  	    if(Ů.isSelected())
	                           ssex=Ů.getText();
	                         else {
	  						  ssex="--";
	  					   }
	                     }          	
	              		            
	          	 		 //��Ҫ��ѯ�ķ���������д���ļ�
	          	 		FileWriter fw=null;
	      				BufferedWriter out=null;  //ѧ��","����","�Ա�","����","�绰����","��ͥסַ","����" };
	      				try {
	      					 fw = new FileWriter("��ѯʱ��ʱ��ŵ��ļ�.txt");
	      					 out = new BufferedWriter(fw);
	      					 //����ѧ�ŵ��м��һ���ո�
	      					 out.write(sID+"  ");
	      					 out.write(sname+"  ");
	      					 out.write(ssex+"  ");
	      					 out.write(sage+"  "); 					   					 
	      					 out.write(scall+"  ");
	      					 out.write(shome+"  ");
	      					 out.write(siden+"  "); //ÿ�θ���д�룬����ȫ������
	      				   					 
	      					out.close();
	      					fw.close();
	      						
	      				} catch (IOException e1) {
	      					e1.printStackTrace();
	      					
	      				}     				
	      				//��ʼ��ѯ
	      				new showones();  
	      				
	      				//����ı���
	      				ѧ��.setText("");
	      				����.setText("");
	      				����.setText("");
	      				�绰����.setText("");
	      			    ��ͥסַ.setText("");
	      			    ����.setText("");
	      				group.clearSelection();
	      				
	          	    }	     		   
	               }); 	   

	    ����.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);      //Ŀ����ʹ�ؼ���������ʾ����
				new Login();
			}
		});
  }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}

