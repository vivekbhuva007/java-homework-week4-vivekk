package programme;

import java.awt.*;
public class TaskSixteen{
        private int x;
        private int y;

        public TaskSixteen() {
        }

        public TaskSixteen(int i, int i1) {
        }

        public void Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public double distance() {
            return distance(0, 0);
        }

        public double distance(int x, int y) {

            return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        }

        public double distance(TaskSixteen secondPoint) {

            return distance(secondPoint.x, secondPoint.y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }


        public static void main(String[] args) {

            TaskSixteen first = new TaskSixteen(6, 5);

            TaskSixteen second = new TaskSixteen(3, 1);

            System.out.println("distance(0,0)= " + first.distance());

            System.out.println("distance(second)= " + first.distance(second));

            System.out.println("distance(2,2)= " + first.distance(2, 2));

            TaskSixteen point = new TaskSixteen();

            System.out.println("distance()= " + point.distance());


        }
    }

