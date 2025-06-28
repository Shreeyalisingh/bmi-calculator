import java.io.PrintWriter;
import java.net.Socket;
import java.time.Instant;

public class MetricSender {
    public static void send(String name, int value) {
        try (Socket socket = new Socket("127.0.0.1", 2003);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            long timestamp = Instant.now().getEpochSecond();
            String metric = String.format("bmi.%s %d %d", name, value, timestamp);
            writer.println(metric);
            System.out.println("✅ Sent to Graphite: " + metric);
        } catch (Exception e) {
            System.err.println("❌ Failed to send metric: " + e.getMessage());
        }
    }
}


