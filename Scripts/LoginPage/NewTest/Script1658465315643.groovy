import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

int day = 3, month = 3, year = 2060

SimpleDateFormat DateFor = new SimpleDateFormat("dd MMM yyyy");
SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");

Date d = DateFormat.parse("${day}-${month}-${year}")
String datex = DateFor.format(d)
println("dateString: ${datex}")
