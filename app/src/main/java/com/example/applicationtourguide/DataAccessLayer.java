package com.example.applicationtourguide;

import android.content.Context;

import java.util.List;

public class DataAccessLayer {

    DatabaseHelper myDb;

    public DataAccessLayer(Context context) {
        myDb = new DatabaseHelper(context);
    }

    //Storing Data Into Database
    public void loadData() {

        //Inserting Data in table Hotel
        ModelClass modelClass1 = new ModelClass("Mount Albert Motor Inn", "743 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.motorin),
                "It is a very nice 3-star hotel with good services and reputation", "09-846 4959",
                "mountalbertmotorinn.co.nz");
        myDb.insertData(modelClass1,"tbHotel");
        ModelClass modelClass2 = new ModelClass("Mount Albert Lodge Cafe", "201 Carrington Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.lodgecafe),
                "It is a good and affordable motel ", "09-846 2188",
                "www.mtalbertlodge.co.nz");
        myDb.insertData(modelClass2,"tbHotel");
        ModelClass modelClass3 = new ModelClass("The Quiet Quarter", "1/3 Mount Royal Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.quietquater),
                "It is a very nice 4-star hotel", "09-846 4959",
                "thequietquarter.newzealandhotels");
        myDb.insertData(modelClass3,"tbHotel");
        ModelClass modelClass4 = new ModelClass("Joy House", "24a Fontenoy St, Mount Albert, Auckland 1025", String.valueOf(R.drawable.img1),
                "It is a  very nice 4-star hotel ", "02102372049",
                "sunnymteden.newzealandhotels");
        myDb.insertData(modelClass4,"tbHotel");
        ModelClass modelClass5 = new ModelClass("Mount Albert Guest House", "4 Alexis Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.guesthouse),
                "A guest house in a very nice environment with beautiful infrastructure", "09-846 4959",
                "www.trademe.co.nz");
        myDb.insertData(modelClass5,"tbHotel");
        ModelClass modelClass6 = new ModelClass("Stamford Plaza Auckland", "22 - 26 Albert Street Auckland ", String.valueOf(R.drawable.stamford),
                "In addition to an indoor pool, Stamford Plaza Auckland provides a spa tub, a sauna, \n" +
                        "and a 24-hour fitness center. Dining is available at one of the hotel's 2 restaurants.  ", "02102372049",
                "www.stamford.com.au/spak");
        myDb.insertData(modelClass6,"tbHotel");


        //Inserting Data in table Restaurant
        ModelClass modelClass7 = new ModelClass("Albert's Post", "911a New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.albertspost),
                "'Nestled in the heart of Mt Albert village, beside the train station, \n" +
                        "Albert’s Post is a cosy and modern eatery, open for small bites, dinner and drinks \n" +
                        "(and lunch on Saturday and Sunday).", "09-849 2557",
                "www.bit.ly");
        myDb.insertData(modelClass7,"tbRestaurant");
        ModelClass modelClass8 = new ModelClass("Burger Wisconsin", "892 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.burger),
                "Good reviews for food. 4.4 stars", "09-849 8120",
                "burgerwisconsin.co.nz");
        myDb.insertData(modelClass8,"tbRestaurant");
        ModelClass modelClass9 = new ModelClass("Chill Out Thai Restaurant & Delivery", "Shop 12, Chill Out 945A New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.chillout),
                "Good reviews for food. 4.3 stars", "09-845 6936",
                "menulog.co.nz");
        myDb.insertData(modelClass9,"tbRestaurant");
        ModelClass modelClass10 = new ModelClass("Chinoiserie Bar and Eatery", "4 Owairaka Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.chinoiserie),
                "Good reviews for food.4.6 stars.  Mon Closed\n" +
                        "Tue-Wed 5–9pm", "09-971 3836",
                "www.facebook.com/Chinoiserieltd");
        myDb.insertData(modelClass10,"tbRestaurant");
        ModelClass modelClass11 = new ModelClass("Happy Hour Restaurant", "947 New North Rd, Mount Albert, Auckland 1003", String.valueOf(R.drawable.happyhour),
                "Its a good Chinese Restaurant with 4.1 stars review.", "09-815 9848",
                "menulog.co.nz");
        myDb.insertData(modelClass11,"tbRestaurant");
        ModelClass modelClass12 = new ModelClass("Lemon Grass Thai And Malay Cuisine", "881 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.lemonglass),
                "Its a good Malaysian Restaurant with 4.6 stars review.", "09-815 8399",
                "menulog.co.nz");
        myDb.insertData(modelClass12,"tbRestaurant");
        ModelClass modelClass13 = new ModelClass("Mount Albert Noodles House", "930 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.noodleshouse),
                "Reasonable price. One plate serves for three people size. Taste is good.\n" +
                        "Jasmine rice is great and smooth. Fried noodle is great, I love it. \n" +
                        "Vary kinds of foods. Milk tea is available here.", "09-815 3228",
                "menulog.co.nz");
        myDb.insertData(modelClass13,"tbRestaurant");
        ModelClass modelClass14 = new ModelClass("Roadside Kebabs Mt Albert", "934 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.roadside),
                "Its a good Turkish Restaurant with 4.4 stars review.", "09-846 0996",
                "menulog.co.nz");
        myDb.insertData(modelClass14,"tbRestaurant");
        ModelClass modelClass15 = new ModelClass("Rock's Restaurant", "1087 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.rocky),
                "Its a good a Restaurant with good review.", "09-815 0617",
                "menulog.co.nz");
        myDb.insertData(modelClass15,"tbRestaurant");
        ModelClass modelClass16 = new ModelClass("Sal Rose Italian", "1A Alberton Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.salrose),
                "Its a good a Restaurant with good review.", "09-845 5331",
                "menulog.co.nz");
        myDb.insertData(modelClass16,"tbRestaurant");
        ModelClass modelClass17 = new ModelClass("Taco Loco Cantina", "847 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.taco),
                "Its a good a Mexican Restaurant with good review.", "09-215 8542",
                "menulog.co.nz");
        myDb.insertData(modelClass17,"tbRestaurant");
        ModelClass modelClass18 = new ModelClass("Thai Smile 2", "50 Richardson Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.thaismile),
                "Its a good a Thai Restaurant with 4.5 stars review.", "09-815 8282",
                "menulog.co.nz");
        myDb.insertData(modelClass18,"tbRestaurant");
        ModelClass modelClass19 = new ModelClass("The Deccan Indian Restaurant", "5/55 Sainsbury Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.deccan),
                "We're a new joint on the block making delicious, authentic Indian food. \n" +
                        "We are passionate about what we do and would love your feedback...", "09-846 5000",
                "ubereats.com");
        myDb.insertData(modelClass19,"tbRestaurant");
        ModelClass modelClass20 = new ModelClass("Triniti of Silver Cafe", "911 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.silvertri),
                "Its a good a British Restaurant with good review.", "09-815 8591",
                "ubereats.com");
        myDb.insertData(modelClass20,"tbRestaurant");
        ModelClass modelClass21 = new ModelClass("Lemon Grass Thai And Malay Cuisine", "881 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.yammy),
                "Its a good a Malaysian Restaurant with good review.", "09-815 8399",
                "ubereats.com");
        myDb.insertData(modelClass21,"tbRestaurant");

        //Inserting Data in table Clinic
        ModelClass modelClass22 = new ModelClass("Caci ", "87 Taylors Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.caci),
                "Hello, we're Caci, skin and appearance experts.\n" +
                        "We know that looking great, is really about feeling great. \n" +
                        "And we can make it happen, by tailoring a membership, just for you.", "09-815 0502",
                "www.stlukes.caci.co.nz");
        myDb.insertData(modelClass22,"tbClinic");
        ModelClass modelClass23 = new ModelClass("Laser Clinics New Zealand", "Shop S780/80 St Lukes Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.lesser),
                "Laser Clinics offers a unique franchise business opportunity. \n" +
                        "Each location we open is a 50/50 partnership between the franchisee partner and Laser Clinics.", "09-887 6983",
                "www.laserclinicsnewzealand.co.nz");
        myDb.insertData(modelClass23,"tbClinic");
        ModelClass modelClass24 = new ModelClass("Mount Albert Medical & Dental Centre", "986 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.medicalndental),
                "Has a good conduct and nice reviews", "09-846 7493",
                "albertmedicalndental.co.nz");
        myDb.insertData(modelClass24,"tbClinic");
        ModelClass modelClass25 = new ModelClass("Mt Albert Orthodontic Centre", "1 Willcott St, Mount Albert, Auckland 1025", String.valueOf(R.drawable.orthodontic),
                "Child and Adult Orthodontics, CLEAR BRACES – METAL BRACES * Functional and Invisaline appliances.", "09-849 5161",
                "info@smilesahead.co.nz");
        myDb.insertData(modelClass25,"tbClinic");
        ModelClass modelClass26 = new ModelClass("Mt Albert Physiotherapy", "1002 New North Road, Mt Albert 1025", String.valueOf(R.drawable.physiotheraphy),
                "Established in 1983 and certified in 1989, Mt Albert Physiotherapy Clinic in Auckland is \n" +
                        "managed and operated by Patricia Beattie. Patricia is a highly qualified physiotherapist with over 40 years experience.", "09 846 8187",
                "www.mtalbertphysiotherapy.co.nz");
        myDb.insertData(modelClass26,"tbClinic");
        ModelClass modelClass27 = new ModelClass("White Cross Dental", "52 St Lukes Rd, Mount Albert, Mt Albert 1025", String.valueOf(R.drawable.whitecross),
                "Child and Adult Orthodontics, CLEAR BRACES and has good reputation", "09-849 2262",
                "www.dentiststlukes.co.nz");
        myDb.insertData(modelClass27,"tbClinic");

        //Inserting Data in table Institution
        ModelClass modelClass28 = new ModelClass("Auckland Institute Of Studies", "28A Linwood Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.ais),
                "Auckland Institute of Studies is the largest privately owned tertiary institute in Auckland, New Zealand. \n" +
                        "AIS was established in 1990, in Auckland's Downtown shopping centre..", "09-815 1717",
                "www.ais.ac.nz");
        myDb.insertData(modelClass28,"tbInstitution");
        ModelClass modelClass29 = new ModelClass("Elim Christian College, Auckland", "1 McLean St, Mount Albert, Auckland 1025", String.valueOf(R.drawable.elm),
                "Elim Christian College community aims for each student to be inspired, responsible, academically \n" +
                        "and practically skilled lifelong learners, living their Christian values and exploring their ", "09-846 2159",
                "www.elim.school.nz");
        myDb.insertData(modelClass29,"tbInstitution");
        ModelClass modelClass30= new ModelClass("Marcellin College", "617 Mount Albert Rd, Royal Oak, Auckland 1023", String.valueOf(R.drawable.marcelin),
                "Marcellin College is a Catholic, integrated, co-educational college in Hillsborough,  \n" +
                        "Auckland, New Zealand for students in Year 7 to Year 13. The college was founded by the \n" +
                        "Marist Brothers in 1958 as a school for boys only.", "09-625 6509",
                "www.marcellin.school.nz");
        myDb.insertData(modelClass30,"tbInstitution");
        ModelClass modelClass31= new ModelClass("Marist College", "31 Alberton Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.marist),
                "Marist College is a Catholic girls high-school located in Mount Albert, \n" +
                        "Auckland, New Zealand. It teaches from year 7 through to year 13 with \n" +
                        "a broad curriculum and an ethos based on Roman Catholicism.", "09-846 8311",
                "www.maristcollege.school.nz");
        myDb.insertData(modelClass31,"tbInstitution");
        ModelClass modelClass32= new ModelClass("Mount Albert Grammar School", "Alberton Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.albertgrammer),
                "Mount Albert Grammar School is a semi co-educational state secondary school in Mount Albert \n" +
                        "in Auckland, New Zealand. It teaches students in year levels 9 to 13..", "09-846 2044",
                "www.mags.school.nz");
        myDb.insertData(modelClass32,"tbInstitution");
        ModelClass modelClass33= new ModelClass("New Zealand College of Business", "Mount Albert, Auckland 1025", String.valueOf(R.drawable.nzclb),
                "The New Zealand College of Business (also known as NZCB) was registered in New Zealand \n" +
                        "with the Ministry of Education in 2004 according to the 1989 “Education Act” (code: 1327).", "09-849 6668",
                "nzcb.ac.nz");
        myDb.insertData(modelClass33,"tbInstitution");
        ModelClass modelClass34= new ModelClass("Unitec Institute of Technology", "139 Carrington Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.unitec),
                "Unitec Institute of Technology is the largest institute of technology in Auckland\n" +
                        "New Zealand. 16,844 students study programmes from certificate to postgraduate degree level across a range of subjects from \n" +
                        " architecture to zookeeping.", "09-815 4321",
                "www.unitec.ac.nz");
        myDb.insertData(modelClass34,"tbInstitution");

        //Inserting Data in table Shopping center
        ModelClass modelClass35= new ModelClass("Westfield St Lukes", "80 St Lukes Rd, St Lukes, Auckland 1346", String.valueOf(R.drawable.westfield),
                "Westfield St Lukes, one of the big three shopping centres in the western suburbs " +
                        "of Auckland, New Zealand, stands on St Lukes Road in the suburb of Mount Albert. \n" +
                        "It receives about 6 million shopper visits annually.", "09-978 6000",
                "www.westfield.co.nz");
        myDb.insertData(modelClass35,"tbShopping");
        ModelClass modelClass36= new ModelClass("PAK'n SAVE Mt Albert", "1167-1177 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.paknsave),
                "At PAK'nSAVE Mt Albert we provide you with the lowest prices, " +
                        "friendly service, local products that make your dollar go further.", "09-820 0218",
                "www.paknsave.co.nz");
        myDb.insertData(modelClass36,"tbShopping");
        ModelClass modelClass37= new ModelClass("Countdown St Lukes", "80 St Lukes Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.countdown),
                "Countdown is your local supermarket, committed to making Kiwis’ lives " +
                        "a little better every day by providing you with choice, value and convenience.", "09-846 9742",
                "www.countdown.co.nz");
        myDb.insertData(modelClass37,"tbShopping");
        ModelClass modelClass38= new ModelClass("Warehouse Stationery St Lukes", "8/1 Wagener Place Mega Centre St Lukes, Mount Albert, Auckland 1025", String.valueOf(R.drawable.warehouse),
                "Office supply store in Auckland, New Zealand", "09-846 4748",
                "www.thewarehouse.co.nz");
        myDb.insertData(modelClass38,"tbShopping");
        ModelClass modelClass39= new ModelClass("955 shopping centre", "955 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.shopcen),
                "4stars Shopping mall in Auckland, New Zealand", "09-846 8188",
                "www.955shop.com");
        myDb.insertData(modelClass39,"tbShopping");
        ModelClass modelClass40= new ModelClass("City Bridal Auckland", "1016 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.bridal),
                "A Bridal shop in Auckland, New Zealand", "09-815 0888",
                "www.bridalshop.com");
        myDb.insertData(modelClass40,"tbShopping");
        ModelClass modelClass41= new ModelClass("Mt Albert Fruit and Veg", "955 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.fruitsnveges),
                "Fresh fruits and vegetable store", "09-815 8666",
                "www.fruitsnveges.com");
        myDb.insertData(modelClass41,"tbShopping");
        ModelClass modelClass42= new ModelClass("Games Workshop", "2/945 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.gameworks),
                "Miniatures store in Auckland, New Zealand", "09-846 3008",
                "www.gameworks.com");
        myDb.insertData(modelClass42,"tbShopping");
        ModelClass modelClass43= new ModelClass("Good Thing", "849 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.goodthing),
                "Home goods store in Auckland, New Zealand", "09-815 2052",
                "www.goodthing.com");
        myDb.insertData(modelClass43,"tbShopping");
        ModelClass modelClass44= new ModelClass("Knitnstitch", "52 Richardson Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.knitn),
                "Yarn store in Auckland, New Zealand", "021 985 088",
                "www.knitnstitch.co.nz");
        myDb.insertData(modelClass44,"tbShopping");
        ModelClass modelClass45= new ModelClass("The Little Flower Shop", "822 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.lilflower),
                "Florist in Auckland, New Zealand", "09-846 4400",
                "www.lilflower.com");
        myDb.insertData(modelClass45,"tbShopping");
        ModelClass modelClass46= new ModelClass("Mount Albert Souvenirs", "953 New North Rd, Mount Albert, 1025", String.valueOf(R.drawable.souvenirs),
                "Souvenir store in Auckland, New Zealand", "09-845 4828",
                "www.mtalsouvenirs.com");
        myDb.insertData(modelClass46,"tbShopping");
        ModelClass modelClass47= new ModelClass("Supplements.co.nz", "1 Wagener Pl, Mount Albert, Auckland 1025", String.valueOf(R.drawable.supplements),
                "Vitamin & supplements store in Auckland, New Zealand", "09-849 4102",
                "supplements.co.nz");
        myDb.insertData(modelClass47,"tbShopping");

        //Inserting Data in table Travel Agent
        ModelClass modelClass48= new ModelClass("CHINA TRAVEL SERVICE", "955 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.chinatravels),
                "Travel agency in Auckland, New Zealand", "09-845 6679",
                "kiwiyou.co.nz");
        myDb.insertData(modelClass48,"tbTravelagent");
        ModelClass modelClass49= new ModelClass("Eco Travels", "922 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.ecotravel),
                "It's the trip of a lifetime, and it's important to select the right travel company . \n" +
                        "So, choose the best and largest travel agency in New Zealand to book your tickets for a memorable journey.", "09-620 0112",
                "www.ecotravels.co.nz");
        myDb.insertData(modelClass49,"tbTravelagent");
        ModelClass modelClass50= new ModelClass("Flight Centre", "922 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.flightcenter),
                "Travel agency in Auckland, New Zealand", "0800 777 858",
                "www.flightcentre.co.nz");
        myDb.insertData(modelClass50,"tbTravelagent");
        ModelClass modelClass51= new ModelClass("Worldway Travel", "935B New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.worldway),
                "Travel agency in Auckland, New Zealand", "09-815 1122",
                "www.wanguo.co.nz");
        myDb.insertData(modelClass51,"tbTravelagent");

        //Inserting Data in table Travel Agent
        ModelClass modelClass52= new ModelClass("Arokaya Thai massage Auckland", "893 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.arokaya),
                "We will greet you with a warm smile and refreshing cup of ginger tea. \n" +
                        "With years of experience, we can provide you with a soothing massage to \n" +
                        "leave you feeling relaxed and re-energised.", "09-846 9887",
                "www.arokaya.co.nz");
        myDb.insertData(modelClass52,"tbSpa");
        ModelClass modelClass53= new ModelClass("Baankaew Thai Sport Massage", "760 New North Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.baankaew),
                "We specialise in traditional Thai massage and Sport massage creating \n" +
                        "Thai sport massage that has been treating people for over 1000 years. ", "09-214 6103",
                "www.baankaew.org");
        myDb.insertData(modelClass53,"tbSpa");
        ModelClass modelClass54= new ModelClass("Fans Massage", "80 St Lukes Rd, Mount Albert, Auckland 1025", String.valueOf(R.drawable.fanmassage),
                "Health spa in Auckland, New Zealand", "09-845 5273",
                "www.fanmassage.co.nz");
        myDb.insertData(modelClass54,"tbSpa");
        ModelClass modelClass55= new ModelClass("Jaynes Day Spa", "34 Weston Ave, Mount Albert, Auckland 1025", String.valueOf(R.drawable.jaynes),
                "Day spa in Auckland, New Zealand", "09-845 5524",
                "www.jaynesdaymassage.co.nz");
        myDb.insertData(modelClass55,"tbSpa");

        //Inserting Data in table Taxi
        ModelClass modelClass56= new ModelClass("Budget Taxis", "9 Taylors Rd, Morningside, Mt Albert 2024", String.valueOf(R.drawable.budgettaxi),
                "Reliable Taxis in Auckland, New Zealand", "09-275 3211",
                "budgettaxis.co.nz");
        myDb.insertData(modelClass56,"tbTaxi");
        ModelClass modelClass57= new ModelClass("Uber", "317 New North Rd, Kingsland, Auckland 1021", String.valueOf(R.drawable.uber),
                "Uber Technologies, Inc. is an American multinational transportation network company (TNC) " +
                        "offering services that include peer-to-peer ridesharing, ride service hailing, food delivery, " +
                        "and a bicycle-sharing system", "09-888 0766",
                "www.uber.com");
        myDb.insertData(modelClass57,"tbTaxi");
        ModelClass modelClass58= new ModelClass("Ola Cabs", "Auckland, New Zealand", String.valueOf(R.drawable.olacabs),
                "Ola Cabs, is an Indian origin online transportation network company developed " +
                        "by ANI Technologies Pvt. Ltd. As of May 2019, ", "09 884 2437",
                "ola.co.nz");
        myDb.insertData(modelClass58,"tbTaxi");
    }

    //Retrive Data From Database
    public List<ModelClass> RetrieveData(String filter, String TableName){

        return myDb.ItemList(filter,TableName);
    }
}
