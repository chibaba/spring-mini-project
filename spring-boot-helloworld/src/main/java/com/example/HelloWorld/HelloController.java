

@Controller
public class HelloController {
    private Map<String, object> result = new HashMap<>();

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, Object> hello() {
        result.put("name", "stephen");
        result.put("city", "san Jose");
        return result;
    }
}