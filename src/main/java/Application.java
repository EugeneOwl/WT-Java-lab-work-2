import service.MenuService;
import service.impl.MenuServiceImpl;

/**
 * @author e.ivanov
 * @since 28.10.2018
 */
public class Application {
    public static void main(String[] args) throws Exception {
        MenuService menuService = new MenuServiceImpl();
        menuService.runMenu();
    }
}
