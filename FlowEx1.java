package flowEx01;

public class FlowEx1 {
 // ���� : ���� �� �ش� int x�� ���� ���� �˻��Ͽ� 
//  ��� ���θ� Ȯ���϶� 
	public static void main(String[] args) {
		//���� �Լ� �ۼ� 
		
		int x= 0; 
		// x���� integer ������ ���� �ʱⰪ�� 0���� ���� 
		
		System.out.printf("x= %d �� �� , ���� ���� %n ",x);
		//��¹� �ۼ�
		
		if(x==0) System.out.println("x==0"); // => ���� �� : ��� 
		
		/* if ���� ���ǹ����μ� if(�˻��ϰ��� �ϴ� ��)
		   �� ��/�����̳Ŀ� ���� ��� ���θ� �����Ѵ�. 
		*/
		
		if(x!=0) System.out.println("x!=0"); // => ���� ���� 
		if(!(x==0)) System.out.println("!(x==0)"); // => ���� ���� 
		if(!(x!=0)) System.out.println("!(x!=0)"); // => ���� �� : ��� 
		x = 1; 
		System.out.printf("x= %d �� �� , ���� ���� %n ",x);
		if(x==0) System.out.println("x==0");  // => ���� ����
		if(x!=0) System.out.println("x!=0"); // => ���� �� : ���
		if(!(x==0)) System.out.println("!(x==0)"); // => ���� �� : ���
		if(!(x!=0)) System.out.println("!(x!=0)");  // => ���� ����
		
		
	}

}
