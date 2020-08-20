package com.softplus.rateexchanger.utilities;

import com.softplus.rateexchanger.BuildConfig;
import com.softplus.rateexchanger.R;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static final String BASE_URL = "https://openexchangerates.org/api/latest.json";
    public static final String APP_KEY = BuildConfig.API_ACCESS_KEY;

    public static final String DEFAULT_VIEW_ITEMS = "TWD,JPY,CNY";

    public static final int LOADER_ID = 1;

    public static Map<String, Integer> ImageID_map;
    public static Map<String, String> Country_map;
    public static Map<String, String> Currency_map;

    public static final String ITEM_FOCUS_BACKGROUND_COLOR = "#FF0000";
    public static final String ITEM_UNFOCUS_BACKGROUND_COLOR = "#FFFFFF";

    public static void initConstantsVariables() {
        String symbol;

        ImageID_map = new HashMap<String, Integer>();
        Country_map = new HashMap<String, String>();
        Currency_map = new HashMap<String, String>();

        symbol="AED";
        ImageID_map.put(symbol, R.drawable.aed_united_arab_emirates);
        Country_map.put(symbol, "United Arab Emirates");
        Currency_map.put(symbol, "Emirati Dirham");

        symbol="AFN";
        ImageID_map.put(symbol, R.drawable.afn_afghanistan);
        Country_map.put(symbol, "Afghanistan");
        Currency_map.put(symbol, "Afghan Afghani");

        symbol="ALL";
        ImageID_map.put(symbol, R.drawable.all_albania);
        Country_map.put(symbol, "Albania");
        Currency_map.put(symbol, "Albanian Lek");

        symbol="AMD";
        ImageID_map.put(symbol, R.drawable.amd_armenia);
        Country_map.put(symbol, "Armenia");
        Currency_map.put(symbol, "Armenian Dram");

        symbol="ANG";
        ImageID_map.put(symbol, R.drawable.ang_netherlands);
        Country_map.put(symbol, "Netherlands");
        Currency_map.put(symbol, "Netherlands Antillean Guilder");

        symbol="AOA";
        ImageID_map.put(symbol, R.drawable.aoa_angola);
        Country_map.put(symbol, "Angola");
        Currency_map.put(symbol, "Angolan Kwanza");

        symbol="ARS";
        ImageID_map.put(symbol, R.drawable.ars_argentina);
        Country_map.put(symbol, "Argentina");
        Currency_map.put(symbol, "Argentine Peso");

        symbol="AUD";
        ImageID_map.put(symbol, R.drawable.aud_australia);
        Country_map.put(symbol, "Australia");
        Currency_map.put(symbol, "Australian Dollar");

        symbol="AWG";
        ImageID_map.put(symbol, R.drawable.awg_aruba);
        Country_map.put(symbol, "Aruba");
        Currency_map.put(symbol, "Aruban florin");

        symbol="AZN";
        ImageID_map.put(symbol, R.drawable.azn_azerbaijan);
        Country_map.put(symbol, "Azerbaijan");
        Currency_map.put(symbol, "Azerbaijani manat");

        symbol="BAM";
        ImageID_map.put(symbol, R.drawable.bam_bosnia_and_herzegovina);
        Country_map.put(symbol, "Bosnia and Herzegovina");
        Currency_map.put(symbol, "Bosnian Convertible Marka");

        symbol="BBD";
        ImageID_map.put(symbol, R.drawable.bbd_barbados);
        Country_map.put(symbol, "Barbados");
        Currency_map.put(symbol, "Barbadian Dollar");

        symbol="BDT";
        ImageID_map.put(symbol, R.drawable.bdt_bangladesh);
        Country_map.put(symbol, "Bbangladesh");
        Currency_map.put(symbol, "Bangladeshi taka");

        symbol="BGN";
        ImageID_map.put(symbol, R.drawable.bgn_bulgaria);
        Country_map.put(symbol, "Bulgaria");
        Currency_map.put(symbol, "Bulgarian lev");

        symbol="BHD";
        ImageID_map.put(symbol, R.drawable.bhd_bahrain);
        Country_map.put(symbol, "Bahrain");
        Currency_map.put(symbol, "Bahraini dinar");

        symbol="BIF";
        ImageID_map.put(symbol, R.drawable.bif_burundi);
        Country_map.put(symbol, "Burundi");
        Currency_map.put(symbol, "Burundian franc");

        symbol="BMD";
        ImageID_map.put(symbol, R.drawable.bmd_bermuda);
        Country_map.put(symbol, "Bermuda");
        Currency_map.put(symbol, "Bermudian dollar");

        symbol="BND";
        ImageID_map.put(symbol, R.drawable.bnd_brunei);
        Country_map.put(symbol, "Brunei, Singapore");
        Currency_map.put(symbol, "Brunei dollar");

        symbol="BOB";
        ImageID_map.put(symbol, R.drawable.bob_bolivia);
        Country_map.put(symbol, "Bolivia");
        Currency_map.put(symbol, "Bolivian Bolíviano");

        symbol="BRL";
        ImageID_map.put(symbol, R.drawable.brl_brazil);
        Country_map.put(symbol, "Brazil");
        Currency_map.put(symbol, "Brazilian real");

        symbol="BSD";
        ImageID_map.put(symbol, R.drawable.bsd_bahamas);
        Country_map.put(symbol, "Bahamas");
        Currency_map.put(symbol, "Bahamian Dollar");

        symbol="BTC";
        ImageID_map.put(symbol, R.drawable.bitcoin);
        Country_map.put(symbol, "Virtual Currency_map (WorldWide)");
        Currency_map.put(symbol, "Bitcoin");

        symbol="BTN";
        ImageID_map.put(symbol, R.drawable.btn_bhutan);
        Country_map.put(symbol, "Bhutan");
        Currency_map.put(symbol, "Bhutanese Ngultrum");

        symbol="BWP";
        ImageID_map.put(symbol, R.drawable.bwp_botswana);
        Country_map.put(symbol, "Botswana");
        Currency_map.put(symbol, "Botswana pula");

        symbol="BYN";
        ImageID_map.put(symbol, R.drawable.byn_belarus);
        Country_map.put(symbol, "Belarus");
        Currency_map.put(symbol, "Belarusian ruble");

        symbol="BYR";
        ImageID_map.put(symbol, R.drawable.byn_belarus);
        Country_map.put(symbol, "Belarus");
        Currency_map.put(symbol, "Belarusian ruble");

        symbol="BZD";
        ImageID_map.put(symbol, R.drawable.bzd_belize);
        Country_map.put(symbol, "Belize");
        Currency_map.put(symbol, "Belize dollar");

        symbol="CAD";
        ImageID_map.put(symbol, R.drawable.cad_canada);
        Country_map.put(symbol, "Canada");
        Currency_map.put(symbol, "Canadian Dollar");

        symbol="CDF";
        ImageID_map.put(symbol, R.drawable.cdf_democratic_republic_of_congo);
        Country_map.put(symbol, "Democratic Republic of Congo");
        Currency_map.put(symbol, "Congolese Franc");

        symbol="CHF";
        ImageID_map.put(symbol, R.drawable.chf_switzerland);
        Country_map.put(symbol, "Switzerland, Lichtenstein");
        Currency_map.put(symbol, "Swiss Franc");

        symbol="CLF";
        ImageID_map.put(symbol, R.drawable.clf_chile);
        Country_map.put(symbol, "Chile");
        Currency_map.put(symbol, "Chilean Unit of Account");

        symbol="CLP";
        ImageID_map.put(symbol, R.drawable.clf_chile);
        Country_map.put(symbol, "Chile");
        Currency_map.put(symbol, "Chilean Peso");

        symbol="CNY";
        ImageID_map.put(symbol, R.drawable.cny_china);
        Country_map.put(symbol, "China");
        Currency_map.put(symbol, "Chinese Yuan");

        symbol="COP";
        ImageID_map.put(symbol, R.drawable.cop_colombia);
        Country_map.put(symbol, "Colombia");
        Currency_map.put(symbol, "Colombian Peso");

        symbol="CRC";
        ImageID_map.put(symbol, R.drawable.crc_costa_rica);
        Country_map.put(symbol, "Costa Rica");
        Currency_map.put(symbol, "Costa Rican Colon");

        symbol="CUC";
        ImageID_map.put(symbol, R.drawable.cuc_cuba);
        Country_map.put(symbol, "Cuba");
        Currency_map.put(symbol, "Cuban Convertible Peso");

        symbol="CUP";
        ImageID_map.put(symbol, R.drawable.cuc_cuba);
        Country_map.put(symbol, "Cuba");
        Currency_map.put(symbol, "Cuban Peso");

        symbol="CVE";
        ImageID_map.put(symbol, R.drawable.cve_cape_verde);
        Country_map.put(symbol, "Cape Verde");
        Currency_map.put(symbol, "Cape Verdean Escudo");

        symbol="CZK";
        ImageID_map.put(symbol, R.drawable.czk_czech_republic);
        Country_map.put(symbol, "Czechia");
        Currency_map.put(symbol, "Czech Republic Koruna");

        symbol="DJF";
        ImageID_map.put(symbol, R.drawable.djf_djibouti);
        Country_map.put(symbol, "Djibouti");
        Currency_map.put(symbol, "Djiboutian Franc");

        symbol="DKK";
        ImageID_map.put(symbol, R.drawable.dkk_denmark);
        Country_map.put(symbol, "Denmark");
        Currency_map.put(symbol, "Danish Krone");

        symbol="DOP";
        ImageID_map.put(symbol, R.drawable.dop_dominican_republic);
        Country_map.put(symbol, "Dominican Republic");
        Currency_map.put(symbol, "Dominican Peso");

        symbol="DZD";
        ImageID_map.put(symbol, R.drawable.dzd_algeria);
        Country_map.put(symbol, "Algeria");
        Currency_map.put(symbol, "Algerian Dinar");

        symbol="EGP";
        ImageID_map.put(symbol, R.drawable.egp_egypt);
        Country_map.put(symbol, "Egypt");
        Currency_map.put(symbol, "Egyptian pound");

        symbol="ERN";
        ImageID_map.put(symbol, R.drawable.ern_eritrea);
        Country_map.put(symbol, "Eritrea");
        Currency_map.put(symbol, "Eritrean Nakfa");

        symbol="ETB";
        ImageID_map.put(symbol, R.drawable.etb_ethiopia);
        Country_map.put(symbol, "Ethiopia");
        Currency_map.put(symbol, "Ethiopian Birr");

        symbol="EUR";
        ImageID_map.put(symbol, R.mipmap.ic_launcher);
        Country_map.put(symbol, "Akrotiri and Dhekelia, Andorra, Austria, Belgium, Cyprus, " +
                "Estonia, Finland, France, Germany, Greece, Ireland, Italy, Kosovo, Latvia, Lithuania" +
                "Luxembourg, Malta, Monaco, Montenegro, Netherlands, Portugal, San-Marino, Slovakia" +
                "Slovenia, Spain, Vatican");
        Currency_map.put(symbol, "Euro");

        symbol="FJD";
        ImageID_map.put(symbol, R.drawable.fjd_fiji);
        Country_map.put(symbol, "Fiji");
        Currency_map.put(symbol, "Fijian dollar");

        symbol="FKP";
        ImageID_map.put(symbol, R.drawable.fkp_falkland_islands);
        Country_map.put(symbol, "Falkland Island");
        Currency_map.put(symbol, "Falkland Islands Pound");


        symbol="GBP";
        ImageID_map.put(symbol, R.drawable.gbp_england);
        Country_map.put(symbol, "England");
        Currency_map.put(symbol, "Sterling");

        symbol="GEL";
        ImageID_map.put(symbol, R.drawable.gel_georgia);
        Country_map.put(symbol, "Georgia");
        Currency_map.put(symbol, "Georgian Lari");

        symbol="GGP";
        ImageID_map.put(symbol, R.drawable.ggp_guernsey);
        Country_map.put(symbol, "Guernsey");
        Currency_map.put(symbol, "Guernsey Pound");

        symbol="GHS";
        ImageID_map.put(symbol, R.drawable.ghs_ghana);
        Country_map.put(symbol, "Ghana");
        Currency_map.put(symbol, "Ghanaian Cedi");

        symbol="GIP";
        ImageID_map.put(symbol, R.drawable.gip_gibraltar);
        Country_map.put(symbol, "Gibraltar");
        Currency_map.put(symbol, "Gibraltar pound");

        symbol="GMD";
        ImageID_map.put(symbol, R.drawable.gmd_gambia);
        Country_map.put(symbol, "Gambia");
        Currency_map.put(symbol, "Gambian Dalasi");

        symbol="GNF";
        ImageID_map.put(symbol, R.drawable.gnf_guinea);
        Country_map.put(symbol, "Guinea");
        Currency_map.put(symbol, "Guinean franc");

        symbol="GTQ";
        ImageID_map.put(symbol, R.drawable.gtq_guatemala);
        Country_map.put(symbol, "Guatemala");
        Currency_map.put(symbol, "Guatemalan Quetzal");

        symbol="GYD";
        ImageID_map.put(symbol, R.mipmap.ic_launcher);
        Country_map.put(symbol, "British Guiana");
        Currency_map.put(symbol, "Guyanaese Dollar");

        symbol="HKD";
        ImageID_map.put(symbol, R.drawable.hkd_hong_kong);
        Country_map.put(symbol, "Hong Kong");
        Currency_map.put(symbol, "Hong Kong Dollar");

        symbol="HNL";
        ImageID_map.put(symbol, R.drawable.hnl_honduras);
        Country_map.put(symbol, "Honduras");
        Currency_map.put(symbol, "Honduran Lempira");

        symbol="HRK";
        ImageID_map.put(symbol, R.drawable.hrk_croatia);
        Country_map.put(symbol, "Croatia");
        Currency_map.put(symbol, "Croatian Kuna");

        symbol="HTG";
        ImageID_map.put(symbol, R.drawable.htg_haiti);
        Country_map.put(symbol, "Haiti");
        Currency_map.put(symbol, "Haitian Gourde");

        symbol="HUF";
        ImageID_map.put(symbol, R.drawable.huf_hungary);
        Country_map.put(symbol, "Hungary");
        Currency_map.put(symbol, "Hungarian Forint");

        symbol="IDR";
        ImageID_map.put(symbol, R.drawable.idr_indonesia);
        Country_map.put(symbol, "Indonesia");
        Currency_map.put(symbol, "Indonesian Rupiah");

        symbol="ILS";
        ImageID_map.put(symbol, R.drawable.ic_launcher_foreground); // TODO
        Country_map.put(symbol, "Israeli");
        Currency_map.put(symbol, "Israeli New Sheqel");

        symbol="IMP";
        ImageID_map.put(symbol, R.drawable.imp_isle_of_man);
        Country_map.put(symbol, "Isle of man");
        Currency_map.put(symbol, "Isle of Man Pound");

        symbol="INR";
        ImageID_map.put(symbol, R.drawable.inr_india);
        Country_map.put(symbol, "India");
        Currency_map.put(symbol, "Indian rupee");

        symbol="IQD";
        ImageID_map.put(symbol, R.drawable.iqd_iraq);
        Country_map.put(symbol, "Iraq");
        Currency_map.put(symbol, "Iraqi Dinar");

        symbol="IRR";
        ImageID_map.put(symbol, R.drawable.irr_iran);
        Country_map.put(symbol, "Iran");
        Currency_map.put(symbol, "Iranian Rial");

        symbol="ISK";
        ImageID_map.put(symbol, R.drawable.isk_iceland);
        Country_map.put(symbol, "Iceland");
        Currency_map.put(symbol, "Icelandic Krona");

        symbol="JEP";
        ImageID_map.put(symbol, R.drawable.jep_jersey);
        Country_map.put(symbol, "Jersey");
        Currency_map.put(symbol, "Jersey Pound");

        symbol="JMD";
        ImageID_map.put(symbol, R.drawable.jmd_jamaica);
        Country_map.put(symbol, "Jamaica");
        Currency_map.put(symbol, "Jamaican Dollar");

        symbol="JOD";
        ImageID_map.put(symbol, R.drawable.jod_jordan);
        Country_map.put(symbol, "Jordan");
        Currency_map.put(symbol, "Jordanian Dinar");

        symbol="JPY";
        ImageID_map.put(symbol, R.drawable.jpy_japan);
        Country_map.put(symbol, "Japan");
        Currency_map.put(symbol, "Japanese Yen");

        symbol="KES";
        ImageID_map.put(symbol, R.drawable.kes_kenya);
        Country_map.put(symbol, "Kenya");
        Currency_map.put(symbol, "Kenyan Shilling");

        symbol="KGS";
        ImageID_map.put(symbol, R.drawable.kgs_kyrgyzstan);
        Country_map.put(symbol, "Kyrgyzstan");
        Currency_map.put(symbol, "Kyrgyzstani Som");

        symbol="KHR";
        ImageID_map.put(symbol, R.drawable.khr_cambodia);
        Country_map.put(symbol, "Cambodia");
        Currency_map.put(symbol, "Cambodian Riel");

        symbol="KMF";
        ImageID_map.put(symbol, R.drawable.kmf_comoros);
        Country_map.put(symbol, "Comoros");
        Currency_map.put(symbol, "Comorian Franc");

        symbol="KPW";
        ImageID_map.put(symbol, R.drawable.kpw_northkorea);
        Country_map.put(symbol, "North Korea");
        Currency_map.put(symbol, "North Korean Won");

        symbol="KRW";
        ImageID_map.put(symbol, R.drawable.krw_southkorea);
        Country_map.put(symbol, "South Korea");
        Currency_map.put(symbol, "South Korean Won");

        symbol="KWD";
        ImageID_map.put(symbol, R.drawable.kwd_kwait);
        Country_map.put(symbol, "Kuwait");
        Currency_map.put(symbol, "Kuwaiti Dinar");

        symbol="KYD";
        ImageID_map.put(symbol, R.drawable.kyd_caymanislands);
        Country_map.put(symbol, "Caymanislands");
        Currency_map.put(symbol, "Caymanian Dollar");

        symbol="KZT";
        ImageID_map.put(symbol, R.drawable.kzt_kazakhstan);
        Country_map.put(symbol, "Kazakhstan");
        Currency_map.put(symbol, "Kazakhstani Tenge");

        symbol="LAK";
        ImageID_map.put(symbol, R.drawable.lak_laos);
        Country_map.put(symbol, "Laos");
        Currency_map.put(symbol, "Lao Kip");

        symbol="LBP";
        ImageID_map.put(symbol, R.drawable.lbp_lebanon);
        Country_map.put(symbol, "Lebanon");
        Currency_map.put(symbol, "Lebanese pound");

        symbol="LKR";
        ImageID_map.put(symbol, R.drawable.lkr_srilanka);
        Country_map.put(symbol, "Sri lanka");
        Currency_map.put(symbol, "Sri Lankan Rupee");

        symbol="LRD";
        ImageID_map.put(symbol, R.drawable.lrd_liberia);
        Country_map.put(symbol, "Liberia");
        Currency_map.put(symbol, "Liberian Dollar");

        symbol="LSL";
        ImageID_map.put(symbol, R.drawable.lsl_lesotho);
        Country_map.put(symbol, "Lesotho");
        Currency_map.put(symbol, "Lesotho Loti");

//        // TODO: check this
//        symbol="";
//        ImageID_map.put(symbol, R.drawable.ltl_lithuania);
//        Country_map.put(symbol, "Lithuania");
//        Currency_map.put(symbol, "Lithuanian Litas");

//        // TODO: check this
//        symbol="";
//        ImageID_map.put(symbol, R.drawable.lvl_latvia);
//        Country_map.put(symbol, "Latvia");
//        Currency_map.put(symbol, "Lithuanian Litas");

        symbol="LYD";
        ImageID_map.put(symbol, R.drawable.lyd_libya);
        Country_map.put(symbol, "Libya");
        Currency_map.put(symbol, "Libyan Dinar");

        symbol="MAD";
        ImageID_map.put(symbol, R.drawable.mad_morocco);
        Country_map.put(symbol, "Morocco");
        Currency_map.put(symbol, "Moroccan Dirham");

        symbol="MDL";
        ImageID_map.put(symbol, R.drawable.mdl_moldova);
        Country_map.put(symbol, "Moldova");
        Currency_map.put(symbol, "Moldovan Leu");

        symbol="MGA";
        ImageID_map.put(symbol, R.drawable.mga_madagascar);
        Country_map.put(symbol, "Madagascar");
        Currency_map.put(symbol, "Malagasy Ariary");

        symbol="MKD";
        ImageID_map.put(symbol, R.drawable.mkd_republic_of_macedonia);
        Country_map.put(symbol, "Republic of Macedonia");
        Currency_map.put(symbol, "Macedonian Denar");

        symbol="MMK";
        ImageID_map.put(symbol, R.drawable.mmk_myanmar);
        Country_map.put(symbol, "Myanmar");
        Currency_map.put(symbol, "Burmese Kyat");

        symbol="MNT";
        ImageID_map.put(symbol, R.drawable.mnt_mongolia);
        Country_map.put(symbol, "Mongolia");
        Currency_map.put(symbol, "Mongolian Tugrik");

        symbol="MOP";
        ImageID_map.put(symbol, R.drawable.mop_macau);
        Country_map.put(symbol, "Macau");
        Currency_map.put(symbol, "Macau Pataca");

        symbol="MRU";
        ImageID_map.put(symbol, R.drawable.mro_mauritania);
        Country_map.put(symbol, "Mauritania");
        Currency_map.put(symbol, "Mauritanian Ouguiya");

        symbol="MTL";
        ImageID_map.put(symbol, R.drawable.mur_mauritius);
        Country_map.put(symbol, "Mauritius");
        Currency_map.put(symbol, "Mauritian Rupee");

        symbol="MVR";
        ImageID_map.put(symbol, R.drawable.mvr_maldives);
        Country_map.put(symbol, "Maldives");
        Currency_map.put(symbol, "Maldivian Rufiyaa");

        symbol="MWK";
        ImageID_map.put(symbol, R.drawable.mwk_malawi);
        Country_map.put(symbol, "Malawi");
        Currency_map.put(symbol, "Malawian Kwacha");

        symbol="MXN";
        ImageID_map.put(symbol, R.drawable.mxn_mexico);
        Country_map.put(symbol, "Mexico");
        Currency_map.put(symbol, "Mexican peso");

        symbol="MYR";
        ImageID_map.put(symbol, R.drawable.myr_malasya);
        Country_map.put(symbol, "Malasya");
        Currency_map.put(symbol, "Malaysian Ringgit");

        symbol="MZN";
        ImageID_map.put(symbol, R.drawable.mzn_mozambique);
        Country_map.put(symbol, "Mozambique");
        Currency_map.put(symbol, "Mozambican metical");

        symbol="NAD";
        ImageID_map.put(symbol, R.drawable.nad_namibia);
        Country_map.put(symbol, "Namibia");
        Currency_map.put(symbol, "Namibian Dollar");

        symbol="NGN";
        ImageID_map.put(symbol, R.drawable.ngn_nigeria);
        Country_map.put(symbol, "Nigeria");
        Currency_map.put(symbol, "Nigerian Naira");

        symbol="NIO";
        ImageID_map.put(symbol, R.drawable.nio_nicaragua);
        Country_map.put(symbol, "Nicaragua");
        Currency_map.put(symbol, "Nicaraguan Cordoba");

        symbol="NOK";
        ImageID_map.put(symbol, R.drawable.nok_norway);
        Country_map.put(symbol, "Norway");
        Currency_map.put(symbol, "Norwegian Krone");

        symbol="NPR";
        ImageID_map.put(symbol, R.drawable.npr_nepal);
        Country_map.put(symbol, "Nepal");
        Currency_map.put(symbol, "Nepalese Rupee");

        symbol="NZD";
        ImageID_map.put(symbol, R.drawable.nzd_new_zealand);
        Country_map.put(symbol, "New Zealand, Cook Islands, Niue, Pitcairn Island");
        Currency_map.put(symbol, "New Zealand Dollar");

        symbol="OMR";
        ImageID_map.put(symbol, R.drawable.omr_oman);
        Country_map.put(symbol, "Oman");
        Currency_map.put(symbol, "Omani Rial");

        symbol="PAB";
        ImageID_map.put(symbol, R.drawable.pab_panama);
        Country_map.put(symbol, "Panama");
        Currency_map.put(symbol, "Balboa");

        symbol="PEN";
        ImageID_map.put(symbol, R.drawable.pen_peru);
        Country_map.put(symbol, "Peru");
        Currency_map.put(symbol, "Nuevo Sol");

        symbol="PGK";
        ImageID_map.put(symbol, R.drawable.pgk_papua_new_guinea);
        Country_map.put(symbol, "Papua New Guinea");
        Currency_map.put(symbol, "Kina");

        symbol="PHP";
        ImageID_map.put(symbol, R.drawable.php_philippines);
        Country_map.put(symbol, "Philippines");
        Currency_map.put(symbol, "Philippine Peso");

        symbol="PKR";
        ImageID_map.put(symbol, R.drawable.pkr_pakistan);
        Country_map.put(symbol, "Pakistan");
        Currency_map.put(symbol, "Pakistan Rupee");

        symbol="PLN";
        ImageID_map.put(symbol, R.drawable.pln_poland);
        Country_map.put(symbol, "Poland");
        Currency_map.put(symbol, "Zloty");

        symbol="PYG";
        ImageID_map.put(symbol, R.drawable.pyg_paraguay);
        Country_map.put(symbol, "Paraguay");
        Currency_map.put(symbol, "Guarani");

        symbol="QAR";
        ImageID_map.put(symbol, R.drawable.qar_qatar);
        Country_map.put(symbol, "Qatar");
        Currency_map.put(symbol, "Qatari Rial");

        symbol="RON";
        ImageID_map.put(symbol, R.drawable.ron_romania);
        Country_map.put(symbol, "Romania");
        Currency_map.put(symbol, "Leu");

        symbol="RSD";
        ImageID_map.put(symbol, R.drawable.rsd_serbia);
        Country_map.put(symbol, "Serbia, Kosovo");
        Currency_map.put(symbol, "Serbian Dinar");

        symbol="RUB";
        ImageID_map.put(symbol, R.drawable.rub_russia);
        Country_map.put(symbol, "Russia, South Ossetia");
        Currency_map.put(symbol, "Russian Ruble");

        symbol="RWF";
        ImageID_map.put(symbol, R.drawable.rwf_rwanda);
        Country_map.put(symbol, "Rwanda");
        Currency_map.put(symbol, "Rwanda Franc");

        symbol="SAR";
        ImageID_map.put(symbol, R.drawable.sar_saudi_arabia);
        Country_map.put(symbol, "Saudi Arabia");
        Currency_map.put(symbol, "Saudi Riyal");

        symbol="SBD";
        ImageID_map.put(symbol, R.drawable.sbd_solomon_islands);
        Country_map.put(symbol, "Solomon Islands");
        Currency_map.put(symbol, "Solomon Islands Dollar");

        symbol="SCR";
        ImageID_map.put(symbol, R.drawable.scr_seychelles);
        Country_map.put(symbol, "Seychelles");
        Currency_map.put(symbol, "Seychelles Rupee");

        symbol="SDG";
        ImageID_map.put(symbol, R.drawable.sdg_sudan);
        Country_map.put(symbol, "Sudan");
        Currency_map.put(symbol, "Sudanese Pound");

        symbol="SEK";
        ImageID_map.put(symbol, R.drawable.sek_sweden);
        Country_map.put(symbol, "Sweden");
        Currency_map.put(symbol, "Swedish Krona");

        symbol="SGD";
        ImageID_map.put(symbol, R.drawable.sgd_singapore);
        Country_map.put(symbol, "Singapore");
        Currency_map.put(symbol, "Singapore Dollar");

        symbol="SHP";
        ImageID_map.put(symbol, R.drawable.ic_launcher_foreground); // TODO: No flag
        Country_map.put(symbol, "Saint Helena, Ascension Island, Tristan da Cunha");
        Currency_map.put(symbol, "Saint Helena Pound");

        symbol="SLL";
        ImageID_map.put(symbol, R.drawable.sll_sierra_leone);
        Country_map.put(symbol, "Sierra Leone");
        Currency_map.put(symbol, "Leone");

        symbol="SOS";
        ImageID_map.put(symbol, R.drawable.sos_somalia);
        Country_map.put(symbol, "Somalia");
        Currency_map.put(symbol, "Somali Shilling");

        symbol="SRD";
        ImageID_map.put(symbol, R.drawable.srd_suriname);
        Country_map.put(symbol, "Suriname");
        Currency_map.put(symbol, "Suriname Dollar");

        symbol="STN";
        ImageID_map.put(symbol, R.drawable.std_sao_tome_and_prince);
        Country_map.put(symbol, "Sao Tome and Prince");
        Currency_map.put(symbol, "Dobra");

        symbol="SVC";
        ImageID_map.put(symbol, R.drawable.svc_el_salvador);
        Country_map.put(symbol, "El Salvador");
        Currency_map.put(symbol, "Salvadoran Colón");

        symbol="SYP";
        ImageID_map.put(symbol, R.drawable.syp_syria);
        Country_map.put(symbol, "Syria");
        Currency_map.put(symbol, "Syrian Pound");

        symbol="SZL";
        ImageID_map.put(symbol, R.drawable.szl_swaziland);
        Country_map.put(symbol, "Swaziland");
        Currency_map.put(symbol, "Lilangeni");

        symbol="THB";
        ImageID_map.put(symbol, R.drawable.thb_thailand);
        Country_map.put(symbol, "Thailand");
        Currency_map.put(symbol, "Baht");

        symbol="TJS";
        ImageID_map.put(symbol, R.drawable.tjs_tajikistan);
        Country_map.put(symbol, "Tajikistan");
        Currency_map.put(symbol, "Somoni");

        symbol="TMT";
        ImageID_map.put(symbol, R.drawable.tmt_turkmenistan);
        Country_map.put(symbol, "Turkmenistan");
        Currency_map.put(symbol, "Manat");

        symbol="TND";
        ImageID_map.put(symbol, R.drawable.tnd_tunisia);
        Country_map.put(symbol, "Tunisia");
        Currency_map.put(symbol, "Tunisian Dinar");

        symbol="TOP";
        ImageID_map.put(symbol, R.drawable.top_tonga);
        Country_map.put(symbol, "Tonga");
        Currency_map.put(symbol, "Pa’anga");

        symbol="TRY";
        ImageID_map.put(symbol, R.drawable.try_turkey);
        Country_map.put(symbol, "Turkey, North Cyprus");
        Currency_map.put(symbol, "Turkish Lira");

        symbol="TTD";
        ImageID_map.put(symbol, R.drawable.ttd_trinidad_and_tobago);
        Country_map.put(symbol, "Trinidad and Tobago");
        Currency_map.put(symbol, "Trinidad and Tobago Dollar");

        symbol="TWD";
        ImageID_map.put(symbol, R.drawable.twd_taiwan);
        Country_map.put(symbol, "Taiwan");
        Currency_map.put(symbol, "New Taiwan Dollar");

        symbol="TZS";
        ImageID_map.put(symbol, R.drawable.tzs_tanzania);
        Country_map.put(symbol, "Tanzania");
        Currency_map.put(symbol, "Tanzanian Shilling");

        symbol="UAH";
        ImageID_map.put(symbol, R.drawable.uah_ukraine);
        Country_map.put(symbol, "Ukraine");
        Currency_map.put(symbol, "Hryvnia");

        symbol="UGX";
        ImageID_map.put(symbol, R.drawable.ugx_uganda);
        Country_map.put(symbol, "Uganda");
        Currency_map.put(symbol, "Uganda Shilling");

        symbol="USD";
        ImageID_map.put(symbol, R.drawable.usd_united_states);
        Country_map.put(symbol, "United States of America, American Samoa, British Indian Ocean Territory, " +
                "British Virgin Islands, Guam, Haiti, Marshall Islands, Micronesia, " +
                "Northern Mariana Islands, Pacific Remote islands, Palau, nPanama, " +
                "Puerto Rico, Turks and Caicos Islands, US Virgin Islands");
        Currency_map.put(symbol, "US Dollar");

        symbol="UYU";
        ImageID_map.put(symbol, R.drawable.uyu_uruguay);
        Country_map.put(symbol, "Uruguay");
        Currency_map.put(symbol, "Uruguayo Peso");

        symbol="UZS";
        ImageID_map.put(symbol, R.drawable.uzs_uzbekistn);
        Country_map.put(symbol, "Uzbekistn");
        Currency_map.put(symbol, "Uzbekistan Som");

        symbol="VEF";
        ImageID_map.put(symbol, R.drawable.vef_venezuela);
        Country_map.put(symbol, "Venezuela");
        Currency_map.put(symbol, "Bolivar Fuerte");

        symbol="VND";
        ImageID_map.put(symbol, R.drawable.vnd_vietnam);
        Country_map.put(symbol, "Vietnam");
        Currency_map.put(symbol, "Dong");

        symbol="VUV";
        ImageID_map.put(symbol, R.drawable.vuv_vanuatu);
        Country_map.put(symbol, "Vanuatu");
        Currency_map.put(symbol, "Vatu");

        symbol="WST";
        ImageID_map.put(symbol, R.drawable.wst_samoa);
        Country_map.put(symbol, "Samoa");
        Currency_map.put(symbol, "Tala");

        symbol="XAF";
        ImageID_map.put(symbol, R.drawable.xaf_cameroon);
        Country_map.put(symbol, "Benin, Burkina Faso, Cameroon, Central African Republic, " +
                "Chad, Congo (Brazzaville), Côte d'Ivoire, Equatorial Guinea, Gabon, Guinea-Bissau, " +
                "Mali, Niger, Senegal, Togo");
        Currency_map.put(symbol, "CFA Franc BCEAO");

        symbol="XAG";
        ImageID_map.put(symbol, R.drawable.ic_launcher_foreground); // TODO: check flag (Not relate to Country_map like bitcon)
        Country_map.put(symbol, "Worldwide");
        Currency_map.put(symbol, "Silver Ounce");

        symbol="XAU";
        ImageID_map.put(symbol, R.drawable.ic_launcher_foreground); // TODO: check flag Not relate to Country_map like bitcon)
        Country_map.put(symbol, "Worldwide");
        Currency_map.put(symbol, "Gold Ounce ");

        symbol="XCD";
        ImageID_map.put(symbol, R.drawable.xcd_saint_kitts_and_nevis);
        Country_map.put(symbol, "Anguilla, Antigua and Barbuda, Dominica, Grenada, " +
                "Montserrat, Saint Kitts and Nevis, Saint Lucia, Saint Vincent and Grenadine");
        Currency_map.put(symbol, "East Caribbean Dollar");

        symbol="XDR";
        ImageID_map.put(symbol, R.drawable.ic_launcher_foreground); // TODO: (International Monetary Fund)
        Country_map.put(symbol, "WorldWide");
        Currency_map.put(symbol, "IMF Special Drawing Rights");

        symbol="XOF";
        ImageID_map.put(symbol, R.drawable.ic_launcher_foreground); // TODO: check flag (Communauté Financière Africaine (BCEAO))
        Country_map.put(symbol, "WorldWide");
        Currency_map.put(symbol, "CFA Franc");

        symbol="XPF";
        ImageID_map.put(symbol, R.drawable.wst_samoa); // TODO: check flag (MultiCounty)
        Country_map.put(symbol, "French Polynesia, New Caledonia, Wallis and Futuna");
        Currency_map.put(symbol, "CFP Franc");

        symbol="YER";
        ImageID_map.put(symbol, R.drawable.yer_yemen);
        Country_map.put(symbol, "Yemen");
        Currency_map.put(symbol, "Yemeni Rial");

        symbol="ZAR";
        ImageID_map.put(symbol, R.drawable.zar_south_africa);
        Country_map.put(symbol, "South Africa, Lesotho, Namibia");
        Currency_map.put(symbol, "Rand");

        symbol="ZMW";
        ImageID_map.put(symbol, R.drawable.zmw_zambia);
        Country_map.put(symbol, "Zambia");
        Currency_map.put(symbol, "Zambian Kwacha");

//        symbol="";
//        ImageID_map.put(symbol, R.drawable.zmw_zambia);
//        Country_map.put(symbol, "Zambia");
//        Currency_map.put(symbol, "Zambian Kwacha");
//
//        symbol="";
//        ImageID_map.put(symbol, R.drawable.zwl_zimbabwe);
//        Country_map.put(symbol, "Zimbabwe");
//        Currency_map.put(symbol, "Zimbabwe Dollar");
    }
}
