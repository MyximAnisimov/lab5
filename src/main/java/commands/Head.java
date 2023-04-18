package commands;

import exceptions.WrongAmountOfElementsException;
import managers.CollectionManager;
import tools.Console;
/**
 * Класс, содержащий команду "head". Выводит первый элемент коллекции
 */
public class Head extends AbstractCommand {
    private final CollectionManager collMan;
    public Head(CollectionManager collMan){
super("head","вывод первого элемента коллекции");
        this.collMan=collMan;
    }
    /**
     *Выполняет команду
     * @param argument аргумент, введённый пользователем
     * @return Успешность выполнения команды.
     */
    @Override
    public boolean execute(String argument){
try{
    if(!argument.isEmpty()) throw new WrongAmountOfElementsException();
    Console.printLn(collMan.getFirstElement());
        return true;
    } catch (WrongAmountOfElementsException exception) {
        Console.printLn("Использование: '" + getName() + "'");
    }
        return false;
}
    }

