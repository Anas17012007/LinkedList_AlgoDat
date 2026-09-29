class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }   
}
class LinkedList {
    Node head;
    Node tail;
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void deleteHead() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }
    public void deleteTail() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }
    public void show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Size of the linked list: " + count);
    }
    public void isContains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println(data + " is present in the linked list.");
                return;
            }
            current = current.next;
        }
        System.out.println(data + " is not present in the linked list.");
    }
}
class vehicle {
   void start(){}
   void stop(){}
   void acclerate(int speed){}
   void brake(int speed){}
   void addFuel(int fuel){}
}
class Motorcycle extends vehicle {
   int speed;
   int fuel;
   boolean isRunning;
   @Override 
    public void start() {
    this.speed = 30;
    this.fuel = 5;
    this.isRunning = true;
        System.out.println("Motorcycle started");
    }
    @Override 
    public void acclerate(int newSpeed) {
        if (!isRunning) {
            System.out.println("Motorcycle is not running.");
            return;
        }else if (fuel <= 0) {
            System.out.println("Motorcycle is out of fuel.");
            return;
        } else {
            this.speed += newSpeed;
            this.fuel -= 1;
            System.out.println("Motorcycle speed up to: " + speed);
        }
       
    }
    @Override
    public void brake(int newSpeed) {
        if (!isRunning) {
            System.out.println("Motorcycle is not running.");
            return;
        } else {
            this.speed -= newSpeed;
            if (this.speed < 0) {
                this.speed *= 0.7;
            }
            System.out.println("Motorcycle slowed down to: " + speed);
        }
    }
    @Override
    public void addFuel(int newFuel) {
        this.fuel += newFuel;
        System.out.println("Motorcycle fuel level: " + fuel);
    }
    @Override
    public void stop() {
        this.speed = 0;
        this.isRunning = false;
        System.out.println("Motorcycle stopped");
    }

}
class Bicycle extends vehicle {
    int speed;
    boolean isRunning;
    @Override
    public void start() {
        this.speed = 10;
        this.isRunning = true;
        System.out.println("Bicycle started");
    }
    @Override
    public void acclerate(int newSpeed) {
        if (!isRunning) {
            System.out.println("Bicycle is not running.");
            return;
        } else {
            this.speed += newSpeed;
            System.out.println("Bicycle speed up to: " + speed);
        }
    }
    @Override
    public void brake(int newSpeed) {
        if (!isRunning) {
            System.out.println("Bicycle is not running.");
            return;
        } else {
            this.speed -= newSpeed;
            if (this.speed < 0) {
                this.speed *= 0.7;
            }
            System.out.println("Bicycle slowed down to: " + speed);
        }
    }
    @Override
    public void stop() {
        this.speed = 0;
        this.isRunning = false;
        System.out.println("Bicycle stopped");
    }
}
class Car extends vehicle {
    int speed;
    int fuel;
    boolean isRunning;
    @Override
    public void start() {
        this.speed = 20;
        this.fuel = 10;
        this.isRunning = true;
        System.out.println("Car started");
    }
    @Override
    public void acclerate(int newSpeed) {
        if (!isRunning) {
            System.out.println("Car is not running.");
            return;
        } else if (fuel <= 0) {
            System.out.println("Car is out of fuel.");
            return;
        } else {
            this.speed += newSpeed;
            this.fuel -= 1;
            System.out.println("Car speed up to: " + speed);
        }
    }
    @Override
    public void brake(int newSpeed) {
        if (!isRunning) {
            System.out.println("Car is not running.");
            return;
        } else {
            this.speed -= newSpeed;
            if (this.speed < 0) {
                this.speed *= 0.7;
            }
            System.out.println("Car slowed down to: " + speed);
        }
    }
    @Override
    public void addFuel(int newFuel) {
        this.fuel += newFuel;
        System.out.println("Car fuel level: " + fuel);
    }
    @Override
    public void stop() {
        this.speed = 0;
        this.isRunning = false;
        System.out.println("Car stopped");
    }
}