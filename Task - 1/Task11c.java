	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start, end;

        // String
        start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) s += "a";
        end = System.currentTimeMillis();
        System.out.println("String: " + (end - start) + "ms");

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++) sb.append("a");
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + "ms");

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 100000; i++) sb2.append("a");
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + "ms");
	}
}
