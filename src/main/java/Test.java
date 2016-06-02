import com.jcs_java_sdk.Compute;
import com.jcs_java_sdk.compute_api.model.DescribeImagesRequest;

public class Test {

	public static void main(String[] args) 
	{
		Compute obj = new Compute();
		DescribeImagesRequest req = new DescribeImagesRequest();
		String res = obj.describeImages(req);
		System.out.println(res);
	}

}
