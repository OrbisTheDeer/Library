import com.example.library.classes.Library
import com.example.library.classes.Books
import com.example.library.classes.Newspapers
import com.example.library.classes.Discs
import com.example.library.classes.Month
import com.example.library.classes.BookShop
import com.example.library.classes.NewspaperShop
import com.example.library.classes.DiscShop

import com.example.library.actions.filter
import com.example.library.actions.managerInterface
import com.example.library.actions.selectItem
import com.example.library.actions.chooseAction
import com.example.library.actions.theEnd

var LIBRARY = mutableListOf(
    Books(1, true, "The Jungle Book", 1500, "Redyard Kipling"),
    Books(2, true, "Kanban in Action", 100, "Hammarberg"),
    Books(3, true, "Harry Potter", 100, "J.K. Rouling"),
    Newspapers(1, true, "The Times", 1, Month.MAY.rusName),
    Newspapers(2, true, "Аргументы И Факты", 5, Month.JANUARY.rusName),
    Discs(1, true, "Detroit Become Human", "CD"),
    Discs(2, true, "The Sims 2", "CD"),
    Discs(3, true, "The Sims 3", "CD"),
    Discs(4, true, "The Sims 4", "CD"),
    Discs(5, true, "Hachi: A Dog's Tale", "DVD")
)
val SHOPLIST = listOf(BookShop(), NewspaperShop(), DiscShop())

fun main(){
    mainMenu()
}

fun mainMenu(){
    while(true) {
        println("1. Показать Книги \n2. Показать Газеты \n3. Показать Диски \n4. Управление Менеджером  \n0. Выйти")
        var curLib: List<Library>
        val firstChoice = readlnOrNull()?.toIntOrNull()
        when (firstChoice) {
            1 -> curLib = LIBRARY.filter<Books>()
            2 -> curLib = LIBRARY.filter<Newspapers>()
            3 -> curLib = LIBRARY.filter<Discs>()
            4 -> {
                managerInterface(SHOPLIST)
                continue}
            0 -> break
            else -> {
                println("The value must be between 1 and 3")
                continue
            }
        }
        var (ans, item) = selectItem(curLib)
        if (ans == 0) continue
        ans = chooseAction(item, curLib, LIBRARY)
        if (ans == 0) continue
        ans = theEnd()
        if (ans == 0){
            continue
        } else if (ans == 100) {
            break
        }
    }
}