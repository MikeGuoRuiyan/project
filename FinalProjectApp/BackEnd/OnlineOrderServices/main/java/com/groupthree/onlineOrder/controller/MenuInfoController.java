groupthreepackage com.groupthree.onlineOrder.controller;

import com.groupthree.onlineOrder.entity.MenuItem;
import com.groupthree.onlineOrder.entity.Restaurant;
import com.groupthree.onlineOrder.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MenuInfoController {

    @Autowired
    private MenuInfoService menuInfoService;

    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
    @ResponseBody
    public List<Restaurant> getRestaurants() {
        return menuInfoService.getRestaurants();
    }

    @RequestMapping(value = "/restaurant/{restaurantId}/menu", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuItem> getMenus(@PathVariable(value = "restaurantId") int restaurantId) {
        return menuInfoService.getAllMenuItem(restaurantId);
    }
}
