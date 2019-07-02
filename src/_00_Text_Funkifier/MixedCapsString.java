package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		
		String mixedCaps = "";
		boolean shouldBeCaps = false;
		
		for (int i = 0; i < s.length(); i++) {
			if(shouldBeCaps) {
				char lowercasedChar = s.charAt(i);
				String uppercased = Character.toString(lowercasedChar);
				uppercased = uppercased.toUpperCase();
				mixedCaps = mixedCaps + uppercased;
				shouldBeCaps = !shouldBeCaps;
			}
		else {
			char uppercasedChar = s.charAt(i);
			String lowercased = Character.toString(uppercasedChar);
			lowercased = lowercased.toLowerCase();
			mixedCaps = mixedCaps + lowercased;
			shouldBeCaps = !shouldBeCaps;
		}
			
		}
		return mixedCaps;
	
	}

}
