package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int voscounter = 0;
        int vscounter = 0;
        int zakcounter = 0;
        int socounter = 0;
        int usocounter = 0;

        String input = """
                2006,SO,Střední odborné vzdělání,615
                2006,USO,Úplné střední odborné vzdělání,6212
                2006,VS,Vysokoškolské vzdělání,1520
                2006,ZAK,Základní vzdělání,174
                2007,SO,Střední odborné vzdělání,614
                2007,USO,Úplné střední odborné vzdělání,5976
                2007,VOV,Vyšší odborné vzdělání,214
                2007,VS,Vysokoškolské vzdělání,1502
                2007,ZAK,Základní vzdělání,173
                2008,SO,Střední odborné vzdělání,567
                2008,USO,Úplné střední odborné vzdělání,5793
                2008,VOV,Vyšší odborné vzdělání,197
                2008,VS,Vysokoškolské vzdělání,1499
                2008,ZAK,Základní vzdělání,163
                2009,SO,Střední odborné vzdělání,559
                2009,USO,Úplné střední odborné vzdělání,6265
                2009,VOV,Vyšší odborné vzdělání,206
                2009,VS,Vysokoškolské vzdělání,1731
                2009,ZAK,Základní vzdělání,145
                2010,SO,Střední odborné vzdělání,525
                2010,USO,Úplné střední odborné vzdělání,6069
                2010,VOV,Vyšší odborné vzdělání,207
                2010,VS,Vysokoškolské vzdělání,1904
                2010,ZAK,Základní vzdělání,144
                2011,SO,Střední odborné vzdělání,490
                2011,USO,Úplné střední odborné vzdělání,5953
                2011,VOV,Vyšší odborné vzdělání,206
                2011,VS,Vysokoškolské vzdělání,1992
                2011,ZAK,Základní vzdělání,131
                2012,SO,Střední odborné vzdělání,466
                2012,USO,Úplné střední odborné vzdělání,5891
                2012,VOV,Vyšší odborné vzdělání,194
                2012,VS,Vysokoškolské vzdělání,2153
                2012,ZAK,Základní vzdělání,123
                2013,SO,Střední odborné vzdělání,454
                2013,USO,Úplné střední odborné vzdělání,5816
                2013,VOV,Vyšší odborné vzdělání,211
                2013,VS,Vysokoškolské vzdělání,2268
                2013,ZAK,Základní vzdělání,118
                2014,SO,Střední odborné vzdělání,440
                2014,USO,Úplné střední odborné vzdělání,5784
                2014,VOV,Vyšší odborné vzdělání,228
                2014,VS,Vysokoškolské vzdělání,2378
                2014,ZAK,Základní vzdělání,118
                2015,SO,Střední odborné vzdělání,419
                2015,USO,Úplné střední odborné vzdělání,5544
                2015,VOV,Vyšší odborné vzdělání,226
                2015,VS,Vysokoškolské vzdělání,2399
                2015,ZAK,Základní vzdělání,102
                2016,SO,Střední odborné vzdělání,389
                2016,USO,Úplné střední odborné vzdělání,5409
                2016,VOV,Vyšší odborné vzdělání,231
                2016,VS,Vysokoškolské vzdělání,2407
                2016,ZAK,Základní vzdělání,89
                2017,SO,Střední odborné vzdělání,354
                2017,USO,Úplné střední odborné vzdělání,5436
                2017,VOV,Vyšší odborné vzdělání,238
                2017,VS,Vysokoškolské vzdělání,2458
                2017,ZAK,Základní vzdělání,80
                2018,SO,Střední odborné vzdělání,340
                2018,USO,Úplné střední odborné vzdělání,5489
                2018,VOV,Vyšší odborné vzdělání,249
                2018,VS,Vysokoškolské vzdělání,2572
                2018,ZAK,Základní vzdělání,71
                2019,SO,Střední odborné vzdělání,332
                2019,USO,Úplné střední odborné vzdělání,5397
                2019,VOV,Vyšší odborné vzdělání,259
                2019,VS,Vysokoškolské vzdělání,2578
                2019,ZAK,Základní vzdělání,68
                2020,SO,Střední odborné vzdělání,309
                2020,USO,Úplné střední odborné vzdělání,5393
                2020,VOV,Vyšší odborné vzdělání,269
                2020,VS,Vysokoškolské vzdělání,2614
                2020,ZAK,Základní vzdělání,59""";


        String[] Employee = input.split("\n");
        ArrayList<Employee> ee = new ArrayList<>();


        for (String s : Employee) {
            String[] employee1 = Employee[0].split(",");
            String[] employee2 = s.split(",");
            int thisYear = Integer.parseInt(employee1[0]);
            if (thisYear == Integer.parseInt(employee2[0])) {
                if (employee2[1].equals("VOS")) voscounter = Integer.parseInt(employee2[3]);
                if (employee2[1].equals("VS")) vscounter = Integer.parseInt(employee2[3]);
                if (employee2[1].equals("ZAK")) zakcounter = Integer.parseInt(employee2[3]);
                if (employee2[1].equals("SO")) socounter = Integer.parseInt(employee2[3]);
                if (employee2[1].equals("USO")) usocounter = Integer.parseInt(employee2[3]);
            } else {
                ee.add(new Employee(voscounter, vscounter, zakcounter, socounter, usocounter));
                voscounter = 0;
                vscounter = 0;
                zakcounter = 0;
                socounter = 0;
                usocounter = 0;
            }
        }
        System.out.println();
        System.out.println("EmployeesEducation ee = ...");
        System.out.println("---Year 2006---");
        System.out.println("ZAK: " + ee.get(0).getRatio("ZAK"));
        System.out.println("SO: " + ee.get(0).getRatio("SO"));
        System.out.println("USO: " + ee.get(0).getRatio("USO"));
        System.out.println("VS: " + ee.get(0).getRatio("VS"));
        System.out.println("VOS: " + ee.get(0).getRatio("VOS"));
        System.out.println();
    }
}

