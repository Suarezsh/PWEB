
import java.util.List;
//suarez , villanueva
public class HTMLGenerator {
    
    public String createTitle(String title) {
        return "<title>" + title + "</title>\n";
    }
    public String createHeader(String header, int level) {
        return "<h" + level + ">" + header + "</h" + level + ">\n";
    }

    public String createParagraph(String text) {
        return "<p>" + text + "</p>\n";
    }

    public String createLink(String url, String text) {
        return "<a href=\"" + url + "\">" + text + "</a>\n";
    }

    public String createList(List<String> items, boolean ordered) {
        StringBuilder sb = new StringBuilder();
        if (ordered) {
            sb.append("<ol>\n");
        } else {
            sb.append("<ul>\n");
        }

        for (String item : items) {
            sb.append("  <li>").append(item).append("</li>\n");
        }

        if (ordered) {
            sb.append("</ol>\n");
        } else {
            sb.append("</ul>\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        HTMLGenerator generator = new HTMLGenerator();
        
        StringBuilder html = new StringBuilder();
        html.append(generator.createTitle("Mi Página Web"));
        html.append(generator.createHeader("Bienvenidos a Mi Página", 1));
        html.append(generator.createParagraph("Esta es una simple página web"));
        html.append(generator.createLink("https://sfysh.com", "Haz clic aquí para visitar a Sfysh "));
        html.append(generator.createList(List.of("Elemento 1", "Elemento 2", "Elemento 3"), true))
        System.out.println(html.toString());
    }

    
}
