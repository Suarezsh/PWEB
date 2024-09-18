
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

    
}
