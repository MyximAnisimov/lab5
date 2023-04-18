package commands;

import collections.Person;
import exceptions.WrongAmountOfElementsException;
import managers.CollectionManager;
import tools.Console;

import java.util.ArrayList;
/**
 * Класс, содержащий команду "info". Выводит информацию о коллекции
 */

public class Info extends AbstractCommand{
    private final CollectionManager collMan;
public Info(CollectionManager collMan){
    super("info","вывод информации о коллекции");
    this.collMan=collMan;
}
    /**
     *Выполняет команду
     *
     * @return Успешное выполнение команды
     */
@Override
public boolean execute(String argument){
    try{
        if(!argument.isEmpty()) throw new WrongAmountOfElementsException();
    Console.printLn("Тип коллекции: "+collMan.getType());
    Console.printLn("Количество элементов коллекции: "+collMan.getCollection().size());
    Console.printLn("Дата создания коллекции: "+collMan.getCreationDate());
    return true;
} catch (WrongAmountOfElementsException exception) {
        Console.printLn("Использование: '" + getName() + "'");
    }
        return false;
}

}
