package CW3ex3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Continent {
		AFRICA, ASIA, EUROPE, NorthernAMERICA, OCEANIA, SouthernAMERICA;
		
	public static void main (String[] args) throws IOException {
		System.out.println("Please enter country in English: ");	
		
		Continent continent = Continent.AFRICA;

	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	String country = br.readLine();
	
		
	switch (country) {
	case "Algeria": case "Angola": case "Benin": case "Botswana": case "Burkina": case "Burundi": 
	case "Cameroon": case "Cape Verde": case "Central African Republic": case "Chad": case "Comoros":
	case "Congî": case "Djibouti": case "Egypt": case "Equatorial Guinea": case "Eritrea": case "Ethiopia":
	case "Gabon": case "Gambia": case "Ghana": case "Guinea": case "Guinea-Bissau": case "Ivory Coast":
	case "Kenya": case "Lesotho": case "Liberia": case "Libya": case "Madagascar": case "Malawi": 
	case "Mali": case "Mauritania": case "Mauritius": case "Morocco": case "Mozambique": 
	case "Namibia": case "Niger":case "Nigeria": case "Rwanda": 
	case "Sao Tome and Principe": case "Senegal": case "Seychelles":case "Sierra Leone": 
	case "Somalia": case "South Africa": case "South Sudan": case "Swaziland":
	case "Tanzania": case "Togo": case "Tunisia": case "Uganda": case "Zambia":case "Zimbabwe":
	continent = Continent.AFRICA;
	System.out.println("This country is on the continent Africa");
	break;
	case "Afghanistan": case "Bahrain": case "Bangladesh": case "Bhutan": case "Brunei": 
	case "Burma": case "Cambodia": case "China": case "East Timor": case "Indonesia":
	case "Iran": case "Iraq": case "Israel": case "Japan": case "Jordan": 
	case "Kazakhstan": case "Korea, North": case "Korea, South": case "Kuwait": case "Kyrgyzstan":
	case "Laos": case "Lebanon": case "Malaysia": case "Maldives": case "Mongolia": 
	case "Nepal": case "Oman": case "Pakistan": case "Philippines": case "Qatar":
	case "Russian Federation": case "Saudi Arabia": case "Singapore": case "Sri Lanka": case "Syria": 
	case "Tajikistan": case "Thailand": case "Turkey": case "Turkmenistan": case "United Arab Emirates":
	case "Uzbekistan": case "Vietnam": case "Yemen": 
		continent = Continent.ASIA;
		System.out.println("This country is on the continent Asia");
		break;
		
		
	case "Albania": case "Andorra": case "Armenia": case "Austria": case "Azerbaijan":
	case "Belarus": case "Belgium": case "Bosnia and Herzegovina": case "Bulgaria": case "Croatia": 
	case "Cyprus": case "Czech Republic": case "Denmark": case "Estonia": case "Finland":
	case "France": case "Georgia": case "Germany": case "Greece": case "Hungary":
	case "Iceland": case "Ireland": case "Italy": case "Latvia": case "Liechtenstein": 
	case "Lithuania": case "Luxembourg": case "Macedonia": case "Malta": case "Moldova":
	case "Monaco": case "Montenegro": case "Netherlands": case "Norway": case "Poland":
	case "Portugal": case "Romania": case "San Marino": case "Serbia": case "Slovakia": 
	case "Slovenia": case "Spain": case "Sweden": case "Switzerland": case "Ukraine":
	case "United Kingdom": case "Vatican City": 	
		continent = Continent.EUROPE;
		System.out.println("This country is on the continent  EUROPE");
		break;

		
	case "Antigua and Barbuda": case "Bahamas": case "Barbados": case "Belize": case "Canada":
	case "Costa Rica": case "Cuba": case "Dominica": case "Dominican Republic": case "El Salvador":
	case "Grenada": case "Guatemala": case "Haiti": case "Honduras": case "Jamaica":
	case "Mexico": case "Nicaragua": case "Panama": case "Saint Kitts and Nevis": case "Saint Lucia":
	case "Saint Vincent and the Grenadines": case "Trinidad and Tobago": case "United States":
		continent = Continent.NorthernAMERICA;
		System.out.println("This country is on the continent NorthernAMERICA");
		break;
	
	
	case "Australia": case "Fiji": case "Kiribati": case "Marshall Islands": case "Micronesia":
	case "Nauru": case "New Zealand": case "Palau": case "Papua New Guinea": case "Samoa":
	case "Solomon Islands": case "Tonga": case "Tuvalu": case "Vanuatu	":
		continent = Continent.OCEANIA;
		System.out.println("OCEANIA");
		break;
	
	case "Argentina": case "Bolivia": case "Brazil": case "Chile": case "Colombia":
	case "Ecuador": case "Guyana": case "Paraguay": case "Peru": case "Suriname":
	case "Uruguay": case "Venezuela": 
		continent = Continent.SouthernAMERICA;
		System.out.println("This country is on the continent SouthernAMERICA");
		break;
		default: 
			System.out.println("This is not a country or u made a mistake");
			System.exit(0);
	}
  }
}