package List;
//��������������һ�£�

public class Test{
  public static void main(String[] args)  {
    doubleLinkedList dll = new doubleLinkedList();
    //���
    dll.add("������");
    dll.add("�ӳ���");
    dll.add("������");
    System.out.println(dll);

    //��ӵ���ǰ
    dll.addFirst("����ϼ");
    System.out.println(dll);

    //��ӵ����ͬ���
    dll.addLast("÷�޷�");
    System.out.println(dll);

    //��ӵ�ָ��λ��
    dll.add(4, "������");
    System.out.println(dll);

    //�Ƴ���ǰ��
    dll.removeFirst();
    System.out.println(dll);

    //�Ƴ�����
    dll.removeLast();
    System.out.println(dll);

    //�Ƴ�ָ��λ���ϵ�
    dll.remove(2);
    System.out.println(dll);

    //����ָ��λ���ϵ�Ԫ��
    System.out.println(dll.get(1));

  }
}