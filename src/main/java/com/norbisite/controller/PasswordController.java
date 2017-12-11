package com.norbisite.controller;

import com.norbisite.dao.DailyMessageDAO;
import com.norbisite.dao.DailyPasswordDAO;
import com.norbisite.domain.DailyMessage;
import com.norbisite.domain.DailyPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PasswordController {

    public static int actualDay;
    public static String actualPassword;
    private final DailyPasswordDAO dailyPasswordDAO;
    private final DailyMessageDAO dailyMessageDAO;

    @Autowired
    public PasswordController(DailyPasswordDAO dailyPasswordDAO, DailyMessageDAO dailyMessageDAO) {
        this.dailyPasswordDAO = dailyPasswordDAO;
        this.dailyMessageDAO = dailyMessageDAO;
    }

    @ModelAttribute("messages")
    public List<DailyMessage> getMessages() {
        List<DailyMessage> dailyMessages = new ArrayList<>();
        dailyMessages.addAll(dailyMessageDAO.allMessage());
        return dailyMessages;
    }

    @GetMapping(value = "/admin")
    public String admin(Model model) {
        model.addAttribute("dailyMessage", new DailyMessage());
        return "modifyMessage";
    }

    @PostMapping(value = "/admin")
    public String postAdmin (@ModelAttribute("dailyMessage") DailyMessage dailyMessage) {
        dailyMessageDAO.modify(dailyMessage);
        return "redirect:/";
    }



        @GetMapping(value = "/addDailyPass")
    public void addDailyPass() {
        dailyPasswordDAO.save(new DailyPassword(1, "56CHOT0RT7"));
        dailyPasswordDAO.save(new DailyPassword(2, "A4UPSP94XU"));
        dailyPasswordDAO.save(new DailyPassword(3, "K707GW82F7"));
        dailyPasswordDAO.save(new DailyPassword(4, "VAQN7KXWTS"));
        dailyPasswordDAO.save(new DailyPassword(5, "JI2Q1M0KY7"));
        dailyPasswordDAO.save(new DailyPassword(6, "PI2GGHTN1D"));
        dailyPasswordDAO.save(new DailyPassword(7, "HKD8E9XNBP"));
        dailyPasswordDAO.save(new DailyPassword(8, "IXU3S23KS8"));
        dailyPasswordDAO.save(new DailyPassword(9, "EKXG0FWLA5"));
        dailyPasswordDAO.save(new DailyPassword(10, "GNJBUDI03O"));
        dailyPasswordDAO.save(new DailyPassword(11, "1J4S4UPAIQ"));
        dailyPasswordDAO.save(new DailyPassword(12, "Q5P9IVYR8R"));
        dailyPasswordDAO.save(new DailyPassword(13, "G6JESKE3OC"));
        dailyPasswordDAO.save(new DailyPassword(14, "00ZDXVMNMH"));
        dailyPasswordDAO.save(new DailyPassword(15, "DVIP0DRAQU"));
        dailyPasswordDAO.save(new DailyPassword(16, "UK3H7VDEEL"));
        dailyPasswordDAO.save(new DailyPassword(17, "5O6LY6UEIR"));
        dailyPasswordDAO.save(new DailyPassword(18, "GUCDNNW7QH"));
        dailyPasswordDAO.save(new DailyPassword(19, "TAQMY2HCFC"));
        dailyPasswordDAO.save(new DailyPassword(20, "DG5MWY6KFC"));
        dailyPasswordDAO.save(new DailyPassword(21, "8HC69AFDD0"));
        dailyPasswordDAO.save(new DailyPassword(22, "5ON06HV24T"));
        dailyPasswordDAO.save(new DailyPassword(23, "TW1LCJ09XZ"));
        dailyPasswordDAO.save(new DailyPassword(24, "8IXYC5E1BR"));
    }

    @GetMapping(value = "/addDailyMessages")
    public void addDailyMessages() {
        dailyMessageDAO.save(new DailyMessage(1, "<h2>Első üzenet</h2> <p>Remélem Te is hasonló izgalmakkal vártad azt a pillanatot. " +
                "Eljött. Végre megláthatod a mesterművet. Láthatod, miért dolgoztam ennyit," +
                " mivel töltöttem több órát. Minden pillanatát élveztem. Élveztem, mert tudtam, hogy örömöt okozok Neked" +
                " ezzel. Nagyon szeretlek!!!</p>"));
        dailyMessageDAO.save(new DailyMessage(2, "<h2>Második üzenet</h2> <p> </p>"));
        dailyMessageDAO.save(new DailyMessage(3, "<h2>Harmadik üzenet</h2> <p>Nekem minden ébredés, amit egymás mellett élünk meg, karácsony!! <3 :)</p>"));
        dailyMessageDAO.save(new DailyMessage(4, "<h2>Negyedik üzenet</h2> <p>Az embernek magának kell a párját megteremtenie és nem úgy, hogy a párját erőszakolja önmagához, hanem hogy önmagát alakítja önfeláldozással a párjához. Ez a kölcsönös önfeláldozás: a szerelem.</p>"));
        dailyMessageDAO.save(new DailyMessage(5, "<h2>)Ötödik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(6, "<h2>)Hatodik üzenet</h2> <p>Nekem azok a sikeres meglepetések jutnak eszembe amitől sírva fakadtál. Akkor tudtam, hogy elértem amit akartam. Boldoggá tettelek! :-)</p>"));
        dailyMessageDAO.save(new DailyMessage(7, "<h2>Hetedik üzenet</h2> <p>Hát eljött ez a nap is. Megtartod az első beszédedet a parlamentben. És lehet nem az utolsót! Végtelenül büszke vagyok Rád! A suliban már mindenkinek büszkélkedtem Veled! Szeretlek!</p>"));
        dailyMessageDAO.save(new DailyMessage(8, "<h2>Nyolcadik üzenet</h2> <p>A siker nem egyenes vonal. Sokkal inkább hasonlít a táncra, nyitottnak kell lenni hozzá a lehetőségekre. És úgy látom, hogy te nagyon jól táncolsz! ;-) </p>"));
        dailyMessageDAO.save(new DailyMessage(9, "<h2>Kilencedik üzenet</h2> <p>Egy turista ma is készített olyan fényképet,amin elsétálok a háttérben. Nemsoká hazaviszi, és egy másik országban, egy másik időzónában, egy másik kontinensen megmutatja a családjának, az ismerőseinek, és számomra teljesen idegen emberek egy ismeretlen nyelven egy olyan fotóról fognak beszélni, amin épp rád gondolok.</p>"));
        dailyMessageDAO.save(new DailyMessage(10, "<h2>Tizedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(11, "<h2>Tizenegyedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(12, "<h2>Tizenkettedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(13, "<h2>Tizenharmadik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(14, "<h2>Tizennegyedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(15, "<h2>Tizenötödik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(16, "<h2>Tizenhatodik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(17, "<h2>Tizenhetedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(18, "<h2>Tizennyolcadik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(19, "<h2>Tizenkilencedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(20, "<h2>Huszadik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(21, "<h2>Huszonegyedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(22, "<h2>Huszonkettedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(23, "<h2>Huszonharmadik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
        dailyMessageDAO.save(new DailyMessage(24, "<h2>Huszonnegyedik üzenet</h2> <p>Feltöltés alatt, nézz vissza később!! :) </p>"));
    }
}
