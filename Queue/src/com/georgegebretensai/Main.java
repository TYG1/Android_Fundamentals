package com.georgegebretensai;

class QueueFullException extends Exception {}

class QueueEmptyException extends Exception {}


class Queue<E> {
    private E[] elements;
    private int index = 0;
    private int size;
    private int zero = 0;

    Queue(int size) {
        elements = (E[]) new Object[size];
        this.size = size;
    }

    void enqueue(E element ) throws QueueFullException {
        if (index >= size) {
            throw new QueueFullException();
        }
        elements[index] = element;
        index++;
    }

    E dequeue() throws QueueEmptyException {

        E returnElement;
        if (index <= 0) {
            throw new QueueEmptyException();
        }
        returnElement = elements[zero];
        index--;
        zero++;

        return returnElement;
    }
}


public class Main {
    public static void main(String[] agrs) {
        Queue<String> strings = new Queue<>(2);
        try {
            strings.enqueue("Hello");
            strings.enqueue("World");
            System.out.println(strings.dequeue());
            System.out.println(strings.dequeue());
        } catch (QueueFullException | QueueEmptyException e) {
            e.printStackTrace();
        }

    }
}