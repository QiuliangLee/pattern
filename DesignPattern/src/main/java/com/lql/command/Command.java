package com.lql.command;


//��������ӿ�
public interface Command {

    //ִ�ж���(����)
    public void execute();

    //��������(����)
    public void undo();
}
