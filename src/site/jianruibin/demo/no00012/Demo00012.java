/* Demo00012.java 2020/04/12 16:54:18 Copyright (c) ����� All Rights Reserved. */

package site.jianruibin.demo.no00012;

import java.util.Scanner;

/**
 * <pre>
 * Demo00012 ��֤��¼��Ϣ�ĺϷ���
 * </pre>
 * @date: 2020/04/12 16:54:18
 * @author �����
 * @version 1.0
 * @since JDK 1.8
 * @see
 */
public class Demo00012 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// ����ɨ����
        System.out.println("�������¼�û�����");
        String username = scan.nextLine();// �����û������¼��
        System.out.println("�������¼���룺");
        String password = scan.nextLine();// �����û������¼����
        if (!username.equals("mr")) {// �ж��û����Ϸ���
            System.out.println("�û����Ƿ���");
        } else if (!password.equals("mrsoft")) {// �ж�����Ϸ���
            System.out.println("��¼�������");
        } else {// ͨ���������������ж���Ĭ��ͨ����¼��֤
            System.out.println("��ϲ������¼��Ϣͨ����֤��");
        }
        scan.close();
    }
}