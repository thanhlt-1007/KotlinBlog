package lean.kotlinsb.KotlinBlog

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.ui.Model
import org.springframework.ui.set

@Controller
class HtmlController {
  @GetMapping("/")
  fun blog(model: Model) : String {
    model["title"] = "Blog title"
    return "blog" // blog.mustache
  }
}
