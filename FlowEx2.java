package flowEx02;

import java.util.*;

public class FlowEx2 {

	public static void main(String[] args) {
		int input;
		// INTEGER�� �Է¹��� ���� �ϳ��� ����
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		// ��¹� ����
		Scanner scanner = new Scanner(System.in);
		// Scanner ��ƿ�� ����ϱ� ���� scanner �̸�
		String tmp = scanner.nextLine();
		// tmp�� ���ڿ� ���� �ް� scanner��ü�� .nextLine()�޼��带 �̿��ؼ� �޴¤�
		// nextLine() => ���ڿ��� �޴� �޼���
		input = Integer.parseInt(tmp);
		// pasInt(��ȭ�ϰ��� �ϴ� ���� )

		if (input == 0) {
			// input�� 0�̸�?
			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�");
			// ��¹�
		} else if (input == 1) {
			// input�� 1�̸�? eles if�� if�� �ƴ� �ٸ� ������ �ۼ��ϰ� ������
			// else if ��� ��¹� ���� �ۼ��Ѵ�.
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
			System.out.println("�Է��Ͻ� ���ڴ� 1�Դϴ�");

		} else {
			// ������ else ��� ��¹� ���� �ۼ��Ѵ�.
			System.out.println("�Է��Ͻ� ���ڴ� 0 �� 1�� �ƴմϴ�");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�", input);
		}
	}

}
