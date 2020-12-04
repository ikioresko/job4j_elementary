package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
    Ball ball = new Ball();
    Hare hare = new Hare();
    WolfBall wolf = new WolfBall();
    Fox fox = new Fox();
    hare.tryEat(ball);
    ball.tryRun();
    wolf.tryEat(ball);
    ball.tryRun();
    fox.tryEat(ball);
    ball.tryRun();
    }
}