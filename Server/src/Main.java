/**
 * @author Ilyakova Maria
 * Главный класс, в котором мы просто запускаем приложение
 */
import java.io.IOException;

import Client.Client;
import Exception.*;
import Server.Server;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, IdException, CollectionException, NullException, IndexNotFoundException {
        Server server = new Server();
    }
}
