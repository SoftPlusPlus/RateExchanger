package com.softplus.rateexchanger.utilities;

import com.softplus.rateexchanger.BuildConfig;
import com.softplus.rateexchanger.R;
import com.softplus.rateexchanger.models.Country;

import java.util.HashMap;

public class Constants {
    public static final String BASE_URL = "https://openexchangerates.org/api/latest.json";
    public static final String APP_KEY = BuildConfig.API_ACCESS_KEY;

    public static final String DEFAULT_VIEW_ITEMS = "TWD,JPY,CNY";

    public static final int LOADER_ID = 1;

    public static HashMap<String, Country> CountryList;

    public static final String ITEM_FOCUS_BACKGROUND_COLOR = "#FF0000";
    public static final String ITEM_UNFOCUS_BACKGROUND_COLOR = "#00000000";

    public static void initConstantsVariables() {
        CountryList = new HashMap<>();

        int imageID;
        String symbol, country, currency;

        symbol="AED";
        imageID = R.drawable.aed_united_arab_emirates;
        country = "United Arab Emirates";
        currency = "Emirati Dirham";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="AFN";
        imageID = R.drawable.afn_afghanistan;
        country = "Afghanistan";
        currency = "Afghan Afghani";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ALL";
        imageID = R.drawable.all_albania;
        country = "Albania";
        currency = "Albanian Lek";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="AMD";
        imageID = R.drawable.amd_armenia;
        country = "Armenia";
        currency = "Armenian Dram";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ANG";
        imageID = R.drawable.ang_netherlands;
        country = "Netherlands";
        currency = "Netherlands Antillean Guilder";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="AOA";
        imageID = R.drawable.aoa_angola;
        country = "Angola";
        currency = "Angolan Kwanza";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ARS";
        imageID = R.drawable.ars_argentina;
        country = "Argentina";
        currency = "Argentine Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="AUD";
        imageID = R.drawable.aud_australia;
        country = "Australia";
        currency = "Australian Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="AWG";
        imageID = R.drawable.awg_aruba;
        country = "Aruba";
        currency = "Aruban florin";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="AZN";
        imageID = R.drawable.azn_azerbaijan;
        country = "Azerbaijan";
        currency = "Azerbaijani manat";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BAM";
        imageID = R.drawable.bam_bosnia_and_herzegovina;
        country = "Bosnia and Herzegovina";
        currency = "Bosnian Convertible Marka";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BBD";
        imageID = R.drawable.bbd_barbados;
        country = "Barbados";
        currency = "Barbadian Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BDT";
        imageID = R.drawable.bdt_bangladesh;
        country = "Bbangladesh";
        currency = "Bangladeshi taka";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BGN";
        imageID = R.drawable.bgn_bulgaria;
        country = "Bulgaria";
        currency = "Bulgarian lev";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BHD";
        imageID = R.drawable.bhd_bahrain;
        country = "Bahrain";
        currency = "Bahraini dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BIF";
        imageID = R.drawable.bif_burundi;
        country = "Burundi";
        currency = "Burundian franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BMD";
        imageID = R.drawable.bmd_bermuda;
        country = "Bermuda";
        currency = "Bermudian dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BND";
        imageID = R.drawable.bnd_brunei;
        country = "Brunei, Singapore";
        currency = "Brunei dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BOB";
        imageID = R.drawable.bob_bolivia;
        country = "Bolivia";
        currency = "Bolivian Bolíviano";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BRL";
        imageID = R.drawable.brl_brazil;
        country = "Brazil";
        currency = "Brazilian real";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BSD";
        imageID = R.drawable.bsd_bahamas;
        country = "Bahamas";
        currency = "Bahamian Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BTC";
        imageID = R.drawable.bitcoin;
        country = "Virtual Currency_map (WorldWide)";
        currency = "Bitcoin";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BTN";
        imageID = R.drawable.btn_bhutan;
        country = "Bhutan";
        currency = "Bhutanese Ngultrum";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BWP";
        imageID = R.drawable.bwp_botswana;
        country = "Botswana";
        currency = "Botswana pula";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BYN";
        imageID = R.drawable.byn_belarus;
        country = "Belarus";
        currency = "Belarusian ruble";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BYR";
        imageID = R.drawable.byn_belarus;
        country = "Belarus";
        currency = "Belarusian ruble";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="BZD";
        imageID = R.drawable.bzd_belize;
        country = "Belize";
        currency = "Belize dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CAD";
        imageID = R.drawable.cad_canada;
        country = "Canada";
        currency = "Canadian Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CDF";
        imageID = R.drawable.cdf_democratic_republic_of_congo;
        country = "Democratic Republic of Congo";
        currency = "Congolese Franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CHF";
        imageID = R.drawable.chf_switzerland;
        country = "Switzerland, Lichtenstein";
        currency = "Swiss Franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CLF";
        imageID = R.drawable.clf_chile;
        country = "Chile";
        currency = "Chilean Unit of Account";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CLP";
        imageID = R.drawable.clf_chile;
        country = "Chile";
        currency = "Chilean Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CNY";
        imageID = R.drawable.cny_china;
        country = "China";
        currency = "Chinese Yuan";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="COP";
        imageID = R.drawable.cop_colombia;
        country = "Colombia";
        currency = "Colombian Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CRC";
        imageID = R.drawable.crc_costa_rica;
        country = "Costa Rica";
        currency = "Costa Rican Colon";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CUC";
        imageID = R.drawable.cuc_cuba;
        country = "Cuba";
        currency = "Cuban Convertible Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CUP";
        imageID = R.drawable.cuc_cuba;
        country = "Cuba";
        currency = "Cuban Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CVE";
        imageID = R.drawable.cve_cape_verde;
        country = "Cape Verde";
        currency = "Cape Verdean Escudo";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="CZK";
        imageID = R.drawable.czk_czech_republic;
        country = "Czechia";
        currency = "Czech Republic Koruna";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="DJF";
        imageID = R.drawable.djf_djibouti;
        country = "Djibouti";
        currency = "Djiboutian Franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="DKK";
        imageID = R.drawable.dkk_denmark;
        country = "Denmark";
        currency = "Danish Krone";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="DOP";
        imageID = R.drawable.dop_dominican_republic;
        country = "Dominican Republic";
        currency = "Dominican Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="DZD";
        imageID = R.drawable.dzd_algeria;
        country = "Algeria";
        currency = "Algerian Dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="EGP";
        imageID = R.drawable.egp_egypt;
        country = "Egypt";
        currency = "Egyptian pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ERN";
        imageID = R.drawable.ern_eritrea;
        country = "Eritrea";
        currency = "Eritrean Nakfa";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ETB";
        imageID = R.drawable.etb_ethiopia;
        country = "Ethiopia";
        currency = "Ethiopian Birr";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="EUR";
        imageID = R.mipmap.ic_launcher;
        country = "Akrotiri and Dhekelia, Andorra, Austria, Belgium, Cyprus, " +
                "Estonia, Finland, France, Germany, Greece, Ireland, Italy, Kosovo, Latvia, Lithuania" +
                "Luxembourg, Malta, Monaco, Montenegro, Netherlands, Portugal, San-Marino, Slovakia" +
                "Slovenia, Spain, Vatican";
        currency = "Euro";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="FJD";
        imageID = R.drawable.fjd_fiji;
        country = "Fiji";
        currency = "Fijian dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="FKP";
        imageID = R.drawable.fkp_falkland_islands;
        country = "Falkland Island";
        currency = "Falkland Islands Pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));


        symbol="GBP";
        imageID = R.drawable.gbp_england;
        country = "England";
        currency = "Sterling";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GEL";
        imageID = R.drawable.gel_georgia;
        country = "Georgia";
        currency = "Georgian Lari";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GGP";
        imageID = R.drawable.ggp_guernsey;
        country = "Guernsey";
        currency = "Guernsey Pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GHS";
        imageID = R.drawable.ghs_ghana;
        country = "Ghana";
        currency = "Ghanaian Cedi";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GIP";
        imageID = R.drawable.gip_gibraltar;
        country = "Gibraltar";
        currency = "Gibraltar pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GMD";
        imageID = R.drawable.gmd_gambia;
        country = "Gambia";
        currency = "Gambian Dalasi";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GNF";
        imageID = R.drawable.gnf_guinea;
        country = "Guinea";
        currency = "Guinean franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GTQ";
        imageID = R.drawable.gtq_guatemala;
        country = "Guatemala";
        currency = "Guatemalan Quetzal";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="GYD";
        imageID = R.mipmap.ic_launcher;
        country = "British Guiana";
        currency = "Guyanaese Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="HKD";
        imageID = R.drawable.hkd_hong_kong;
        country = "Hong Kong";
        currency = "Hong Kong Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="HNL";
        imageID = R.drawable.hnl_honduras;
        country = "Honduras";
        currency = "Honduran Lempira";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="HRK";
        imageID = R.drawable.hrk_croatia;
        country = "Croatia";
        currency = "Croatian Kuna";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="HTG";
        imageID = R.drawable.htg_haiti;
        country = "Haiti";
        currency = "Haitian Gourde";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="HUF";
        imageID = R.drawable.huf_hungary;
        country = "Hungary";
        currency = "Hungarian Forint";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="IDR";
        imageID = R.drawable.idr_indonesia;
        country = "Indonesia";
        currency = "Indonesian Rupiah";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ILS";
        imageID = R.drawable.ic_launcher_foreground; // TODO
        country = "Israeli";
        currency = "Israeli New Sheqel";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="IMP";
        imageID = R.drawable.imp_isle_of_man;
        country = "Isle of man";
        currency = "Isle of Man Pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="INR";
        imageID = R.drawable.inr_india;
        country = "India";
        currency = "Indian rupee";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="IQD";
        imageID = R.drawable.iqd_iraq;
        country = "Iraq";
        currency = "Iraqi Dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="IRR";
        imageID = R.drawable.irr_iran;
        country = "Iran";
        currency = "Iranian Rial";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ISK";
        imageID = R.drawable.isk_iceland;
        country = "Iceland";
        currency = "Icelandic Krona";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="JEP";
        imageID = R.drawable.jep_jersey;
        country = "Jersey";
        currency = "Jersey Pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="JMD";
        imageID = R.drawable.jmd_jamaica;
        country = "Jamaica";
        currency = "Jamaican Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="JOD";
        imageID = R.drawable.jod_jordan;
        country = "Jordan";
        currency = "Jordanian Dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="JPY";
        imageID = R.drawable.jpy_japan;
        country = "Japan";
        currency = "Japanese Yen";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KES";
        imageID = R.drawable.kes_kenya;
        country = "Kenya";
        currency = "Kenyan Shilling";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KGS";
        imageID = R.drawable.kgs_kyrgyzstan;
        country = "Kyrgyzstan";
        currency = "Kyrgyzstani Som";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KHR";
        imageID = R.drawable.khr_cambodia;
        country = "Cambodia";
        currency = "Cambodian Riel";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KMF";
        imageID = R.drawable.kmf_comoros;
        country = "Comoros";
        currency = "Comorian Franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KPW";
        imageID = R.drawable.kpw_northkorea;
        country = "North Korea";
        currency = "North Korean Won";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KRW";
        imageID = R.drawable.krw_southkorea;
        country = "South Korea";
        currency = "South Korean Won";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KWD";
        imageID = R.drawable.kwd_kwait;
        country = "Kuwait";
        currency = "Kuwaiti Dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KYD";
        imageID = R.drawable.kyd_caymanislands;
        country = "Caymanislands";
        currency = "Caymanian Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="KZT";
        imageID = R.drawable.kzt_kazakhstan;
        country = "Kazakhstan";
        currency = "Kazakhstani Tenge";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="LAK";
        imageID = R.drawable.lak_laos;
        country = "Laos";
        currency = "Lao Kip";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="LBP";
        imageID = R.drawable.lbp_lebanon;
        country = "Lebanon";
        currency = "Lebanese pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="LKR";
        imageID = R.drawable.lkr_srilanka;
        country = "Sri lanka";
        currency = "Sri Lankan Rupee";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="LRD";
        imageID = R.drawable.lrd_liberia;
        country = "Liberia";
        currency = "Liberian Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="LSL";
        imageID = R.drawable.lsl_lesotho;
        country = "Lesotho";
        currency = "Lesotho Loti";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        //        // TODO: check this
        //        symbol="";
        //        imageID = R.drawable.ltl_lithuania;
        //        country = "Lithuania";
        //        currency = "Lithuanian Litas";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        //        // TODO: check this
        //        symbol="";
        //        imageID = R.drawable.lvl_latvia;
        //        country = "Latvia";
        //        currency = "Lithuanian Litas";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="LYD";
        imageID = R.drawable.lyd_libya;
        country = "Libya";
        currency = "Libyan Dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MAD";
        imageID = R.drawable.mad_morocco;
        country = "Morocco";
        currency = "Moroccan Dirham";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MDL";
        imageID = R.drawable.mdl_moldova;
        country = "Moldova";
        currency = "Moldovan Leu";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MGA";
        imageID = R.drawable.mga_madagascar;
        country = "Madagascar";
        currency = "Malagasy Ariary";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MKD";
        imageID = R.drawable.mkd_republic_of_macedonia;
        country = "Republic of Macedonia";
        currency = "Macedonian Denar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MMK";
        imageID = R.drawable.mmk_myanmar;
        country = "Myanmar";
        currency = "Burmese Kyat";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MNT";
        imageID = R.drawable.mnt_mongolia;
        country = "Mongolia";
        currency = "Mongolian Tugrik";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MOP";
        imageID = R.drawable.mop_macau;
        country = "Macau";
        currency = "Macau Pataca";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MRU";
        imageID = R.drawable.mro_mauritania;
        country = "Mauritania";
        currency = "Mauritanian Ouguiya";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MTL";
        imageID = R.drawable.mur_mauritius;
        country = "Mauritius";
        currency = "Mauritian Rupee";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MVR";
        imageID = R.drawable.mvr_maldives;
        country = "Maldives";
        currency = "Maldivian Rufiyaa";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MWK";
        imageID = R.drawable.mwk_malawi;
        country = "Malawi";
        currency = "Malawian Kwacha";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MXN";
        imageID = R.drawable.mxn_mexico;
        country = "Mexico";
        currency = "Mexican peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MYR";
        imageID = R.drawable.myr_malasya;
        country = "Malasya";
        currency = "Malaysian Ringgit";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="MZN";
        imageID = R.drawable.mzn_mozambique;
        country = "Mozambique";
        currency = "Mozambican metical";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="NAD";
        imageID = R.drawable.nad_namibia;
        country = "Namibia";
        currency = "Namibian Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="NGN";
        imageID = R.drawable.ngn_nigeria;
        country = "Nigeria";
        currency = "Nigerian Naira";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="NIO";
        imageID = R.drawable.nio_nicaragua;
        country = "Nicaragua";
        currency = "Nicaraguan Cordoba";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="NOK";
        imageID = R.drawable.nok_norway;
        country = "Norway";
        currency = "Norwegian Krone";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="NPR";
        imageID = R.drawable.npr_nepal;
        country = "Nepal";
        currency = "Nepalese Rupee";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="NZD";
        imageID = R.drawable.nzd_new_zealand;
        country = "New Zealand, Cook Islands, Niue, Pitcairn Island";
        currency = "New Zealand Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="OMR";
        imageID = R.drawable.omr_oman;
        country = "Oman";
        currency = "Omani Rial";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="PAB";
        imageID = R.drawable.pab_panama;
        country = "Panama";
        currency = "Balboa";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="PEN";
        imageID = R.drawable.pen_peru;
        country = "Peru";
        currency = "Nuevo Sol";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="PGK";
        imageID = R.drawable.pgk_papua_new_guinea;
        country = "Papua New Guinea";
        currency = "Kina";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="PHP";
        imageID = R.drawable.php_philippines;
        country = "Philippines";
        currency = "Philippine Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="PKR";
        imageID = R.drawable.pkr_pakistan;
        country = "Pakistan";
        currency = "Pakistan Rupee";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="PLN";
        imageID = R.drawable.pln_poland;
        country = "Poland";
        currency = "Zloty";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="PYG";
        imageID = R.drawable.pyg_paraguay;
        country = "Paraguay";
        currency = "Guarani";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="QAR";
        imageID = R.drawable.qar_qatar;
        country = "Qatar";
        currency = "Qatari Rial";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="RON";
        imageID = R.drawable.ron_romania;
        country = "Romania";
        currency = "Leu";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="RSD";
        imageID = R.drawable.rsd_serbia;
        country = "Serbia, Kosovo";
        currency = "Serbian Dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="RUB";
        imageID = R.drawable.rub_russia;
        country = "Russia, South Ossetia";
        currency = "Russian Ruble";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="RWF";
        imageID = R.drawable.rwf_rwanda;
        country = "Rwanda";
        currency = "Rwanda Franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SAR";
        imageID = R.drawable.sar_saudi_arabia;
        country = "Saudi Arabia";
        currency = "Saudi Riyal";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SBD";
        imageID = R.drawable.sbd_solomon_islands;
        country = "Solomon Islands";
        currency = "Solomon Islands Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SCR";
        imageID = R.drawable.scr_seychelles;
        country = "Seychelles";
        currency = "Seychelles Rupee";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SDG";
        imageID = R.drawable.sdg_sudan;
        country = "Sudan";
        currency = "Sudanese Pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SEK";
        imageID = R.drawable.sek_sweden;
        country = "Sweden";
        currency = "Swedish Krona";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SGD";
        imageID = R.drawable.sgd_singapore;
        country = "Singapore";
        currency = "Singapore Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SHP";
        imageID = R.drawable.ic_launcher_foreground; // TODO: No flag
        country = "Saint Helena, Ascension Island, Tristan da Cunha";
        currency = "Saint Helena Pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SLL";
        imageID = R.drawable.sll_sierra_leone;
        country = "Sierra Leone";
        currency = "Leone";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SOS";
        imageID = R.drawable.sos_somalia;
        country = "Somalia";
        currency = "Somali Shilling";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SRD";
        imageID = R.drawable.srd_suriname;
        country = "Suriname";
        currency = "Suriname Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="STN";
        imageID = R.drawable.std_sao_tome_and_prince;
        country = "Sao Tome and Prince";
        currency = "Dobra";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SVC";
        imageID = R.drawable.svc_el_salvador;
        country = "El Salvador";
        currency = "Salvadoran Colón";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SYP";
        imageID = R.drawable.syp_syria;
        country = "Syria";
        currency = "Syrian Pound";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="SZL";
        imageID = R.drawable.szl_swaziland;
        country = "Swaziland";
        currency = "Lilangeni";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="THB";
        imageID = R.drawable.thb_thailand;
        country = "Thailand";
        currency = "Baht";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TJS";
        imageID = R.drawable.tjs_tajikistan;
        country = "Tajikistan";
        currency = "Somoni";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TMT";
        imageID = R.drawable.tmt_turkmenistan;
        country = "Turkmenistan";
        currency = "Manat";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TND";
        imageID = R.drawable.tnd_tunisia;
        country = "Tunisia";
        currency = "Tunisian Dinar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TOP";
        imageID = R.drawable.top_tonga;
        country = "Tonga";
        currency = "Pa’anga";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TRY";
        imageID = R.drawable.try_turkey;
        country = "Turkey, North Cyprus";
        currency = "Turkish Lira";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TTD";
        imageID = R.drawable.ttd_trinidad_and_tobago;
        country = "Trinidad and Tobago";
        currency = "Trinidad and Tobago Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TWD";
        imageID = R.drawable.twd_taiwan;
        country = "Taiwan";
        currency = "New Taiwan Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="TZS";
        imageID = R.drawable.tzs_tanzania;
        country = "Tanzania";
        currency = "Tanzanian Shilling";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="UAH";
        imageID = R.drawable.uah_ukraine;
        country = "Ukraine";
        currency = "Hryvnia";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="UGX";
        imageID = R.drawable.ugx_uganda;
        country = "Uganda";
        currency = "Uganda Shilling";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="USD";
        imageID = R.drawable.usd_united_states;
        country = "United States of America";
        currency = "US Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="UYU";
        imageID = R.drawable.uyu_uruguay;
        country = "Uruguay";
        currency = "Uruguayo Peso";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="UZS";
        imageID = R.drawable.uzs_uzbekistn;
        country = "Uzbekistn";
        currency = "Uzbekistan Som";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="VEF";
        imageID = R.drawable.vef_venezuela;
        country = "Venezuela";
        currency = "Bolivar Fuerte";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="VND";
        imageID = R.drawable.vnd_vietnam;
        country = "Vietnam";
        currency = "Dong";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="VUV";
        imageID = R.drawable.vuv_vanuatu;
        country = "Vanuatu";
        currency = "Vatu";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="WST";
        imageID = R.drawable.wst_samoa;
        country = "Samoa";
        currency = "Tala";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="XAF";
        imageID = R.drawable.xaf_cameroon;
        country = "Benin, Burkina Faso, Cameroon, Central African Republic, " +
                "Chad, Congo (Brazzaville), Côte d'Ivoire, Equatorial Guinea, Gabon, Guinea-Bissau, " +
                "Mali, Niger, Senegal, Togo";
        currency = "CFA Franc BCEAO";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="XAG";
        imageID = R.drawable.ic_launcher_foreground; // TODO: check flag (Not relate to Country_map like bitcon)
        country = "Worldwide";
        currency = "Silver Ounce";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="XAU";
        imageID = R.drawable.ic_launcher_foreground; // TODO: check flag Not relate to Country_map like bitcon)
        country = "Worldwide";
        currency = "Gold Ounce ";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="XCD";
        imageID = R.drawable.xcd_saint_kitts_and_nevis;
        country = "Anguilla, Antigua and Barbuda, Dominica, Grenada, " +
                "Montserrat, Saint Kitts and Nevis, Saint Lucia, Saint Vincent and Grenadine";
        currency = "East Caribbean Dollar";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="XDR";
        imageID = R.drawable.ic_launcher_foreground; // TODO: (International Monetary Fund)
        country = "WorldWide";
        currency = "IMF Special Drawing Rights";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="XOF";
        imageID = R.drawable.ic_launcher_foreground; // TODO: check flag (Communauté Financière Africaine (BCEAO))
        country = "WorldWide";
        currency = "CFA Franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="XPF";
        imageID = R.drawable.wst_samoa; // TODO: check flag (MultiCounty)
        country = "French Polynesia, New Caledonia, Wallis and Futuna";
        currency = "CFP Franc";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="YER";
        imageID = R.drawable.yer_yemen;
        country = "Yemen";
        currency = "Yemeni Rial";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ZAR";
        imageID = R.drawable.zar_south_africa;
        country = "South Africa, Lesotho, Namibia";
        currency = "Rand";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        symbol="ZMW";
        imageID = R.drawable.zmw_zambia;
        country = "Zambia";
        currency = "Zambian Kwacha";
        CountryList.put(symbol, new Country(symbol, imageID, country, currency, ""));

        //        symbol="";
        //        imageID = R.drawable.zmw_zambia;
        //        country = "Zambia";
        //        currency = "Zambian Kwacha";
        //
        //        symbol="";
        //        imageID = R.drawable.zwl_zimbabwe;
        //        country = "Zimbabwe";
        //        currency = "Zimbabwe Dollar";
    }
}
