package HW4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Err {

		public static void main(String[] args) throws NumberFormatException, IOException {

			BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

			System.out.println("Write HTTP Error(Ex.: E411): ");
			int NumError = Integer.parseInt(br.readLine());
			System.out.println(error(NumError));
		}

		public static String error(int NumError) {

			Errors HTTPError = Errors.valueOf("E" + NumError);
			return HTTPError.getError();
		}
		
		private enum Errors {

			E400("BadRequest"),
			E401("Unauthorized"),
			E402("Payment Required"),
			E403("Forbidden"),
			E404("Not Found"),
			E405("Method Not Allowed"),
			E406("Not Acceptable"),
			E407("Proxy Authentication Required"),
			E408("Request Timeout"),
			E409("Conflict"),
			E410("Gone"),
			E411("Length Required"),
			E412("Precondition Failed"),
			E413("Payload Too Large"),
			E414("URI Too Long"),
			E415("Unsupported Media Type"),
			E416("Range Not Satisfiable"),
			E417("Expectation Failed"),
			E418("I’m a teapot"),
			E421("Misdirected Request"),
			E422("Unprocessable Entity"),
			E423("Locked"),
			E424("Failed Dependency"),
			E426("Upgrade Required"),
			E428("Precondition Required"),
			E429("Too Many Requests"),
			E431("Request Header Fields Too Large"),
			E449("Retry With"),
			E451("Unavailable For Legal Reasons");
			
			private String error;

			Errors(String error) {
				this.error = error;
			}

			public String getError() {
				return error;
			}
	    }
	}


