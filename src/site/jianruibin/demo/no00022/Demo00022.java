/* Demo00022.java 2020/04/13 21:32:11 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00022;

/**
 * <pre>
 * Demo00022 ��ֹѭ����
 * </pre>
 * 
 * @date: 2020/04/13 21:32:11
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00022
{

    public static void main(String[] args)
    {
        System.out.println("\n-------------�жϵ���ѭ�������ӡ�-------------");
        // ��������
        String[] array = new String[] { "����", "������", "���", "����", "��ѻ", "ϲȵ", "��ӥ", "������", "��ӥ", "������", "��ӥ", "������" };
        System.out.println("���㷢�ֵ�һֻ��ӥ֮ǰ�������Ҷ���ʲô��");
        for (String string : array)
        {// foreach��������
            if (string.equals("��ӥ"))// ���������ӥ
                break;// �ж�ѭ��
            System.out.print("�У�" + string + "        ");// �����������Ԫ��
        }
        System.out.println("\n\n-------------�ж�˫��ѭ�������ӡ�-------------");
        // �����ɼ�����
        int[][] myScores = new int[][] { { 67, 78, 63, 22, 66 }, { 55, 68, 78, 95, 44 }, { 95, 97, 92, 93, 81 } };
        System.out.println("������ο��Գɼ���\n��ѧ\t����\tӢ��\t����\t��ʷ");
        No1: for (int[] is : myScores)
        {// �����ɼ�����
            for (int i : is)
            {
                System.out.print(i + "\t");// ����ɼ�
                if (i < 60)
                {// �����;����������ģ������ж��������
                    System.out.println("\n�ȵȣ�" + i + "�ֵ���ʲô�����Ϊʲô������");
                    break No1;
                }
            }
            System.out.println();
        }
    }

}