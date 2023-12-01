package LabHw9_INES_3BSCS1_SingletonPattern;
import java.util.LinkedList;
import java.util.Queue;
public class QueueSystem
{
    private Queue<Integer> centralizedQueue = new LinkedList<>();
    private int[] helpDeskStations = new int[3];
    public void enqueue()
    {
        int newQueueNumber = centralizedQueue.size() + 1;
        centralizedQueue.add(newQueueNumber);
        System.out.println("Queued number: " + newQueueNumber);
    }
    public void displayQueue()
    {
        System.out.println("Current Queue: " + centralizedQueue);
    }
    public void resetQueue(int newQueueNumber)
    {
        centralizedQueue.clear();
        for (int i = 1; i <= newQueueNumber; i++)
        {
            centralizedQueue.add(i);
        }
        System.out.println("Queue reset to: " + centralizedQueue);
    }
    public void serveCustomer(int helpDeskStationNumber)
    {
        if (!centralizedQueue.isEmpty())
        {
            int servedNumber = centralizedQueue.poll();
            helpDeskStations[helpDeskStationNumber - 1] = servedNumber;
            System.out.println("Help Desk Station " + helpDeskStationNumber + " serving customer with number: " + servedNumber);
        }
        else
        {
            System.out.println("Queue is empty. No customer to serve.");
        }
    }
}
