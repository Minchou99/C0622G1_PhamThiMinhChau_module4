package management_product.controller;

import management_product.model.Product;
import management_product.service.IProductService;
import management_product.service.impl.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    IProductService productService = new ProductService();

    @GetMapping
    public String showList(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save( Product product) {
        product.setId(createId());
//        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        return "redirect:/product";
    }

    public int createId() {
        List<Product> productList = productService.findAll();
        int maxId = 0;
        for (Product product : productList) {
            if (product.getId() > maxId) {
                maxId = product.getId();
            }
        }
        return maxId + 1;
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "view";
    }

    @GetMapping("/search")
    public String searchByName(Model model, @RequestParam String searchName ){
        List<Product> productList = productService.findByName(searchName);
        model.addAttribute("products",productList);
        return "list";
    }

}
