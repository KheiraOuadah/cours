public class Reveil {
    private int heureCourante, minuteCourante, secondeCourante;
    private int heureAlarme, minuteAlarme, secondeAlarme;
    private boolean alarmeActive;

    public Reveil() {
        this.heureCourante = 0;
        this.minuteCourante = 0;
        this.secondeCourante = 0;
        this.heureAlarme = 0;
        this.minuteAlarme = 0;
        this.secondeAlarme = 0;
        this.alarmeActive = false;
    }

    public void setHoraireCourant(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            this.heureCourante = h;
            this.minuteCourante = m;
            this.secondeCourante = s;
        }
    }

    public void setHoraireAlarme(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            this.heureAlarme = h;
            this.minuteAlarme = m;
            this.secondeAlarme = s;
        }
    }

    public void allumerAlarme() {
        this.alarmeActive = true;
    }

    public void eteindreAlarme() {
        this.alarmeActive = false;
    }

    public void controlerAlarme() {
        if (alarmeActive && heureCourante == heureAlarme && minuteCourante == minuteAlarme && secondeCourante == secondeAlarme) {
            System.out.println("ALARME ! Il est " + this.toString());
        }
    }

    public void incrementer() {
        this.secondeCourante++;
        if (this.secondeCourante == 60) {
            this.secondeCourante = 0;
            this.minuteCourante++;
            if (this.minuteCourante == 60) {
                this.minuteCourante = 0;
                this.heureCourante++;
                if (this.heureCourante == 24) {
                    this.heureCourante = 0;
                }
            }
        }
    }

    public int comparerA(Reveil autre) {
        int t1 = this.heureCourante * 3600 + this.minuteCourante * 60 + this.secondeCourante;
        int t2 = autre.heureCourante * 3600 + autre.minuteCourante * 60 + autre.secondeCourante;
        return Integer.compare(t1, t2);
    }

    public int differenceAvec(Reveil autre) {
        int t1 = this.heureCourante * 3600 + this.minuteCourante * 60 + this.secondeCourante;
        int t2 = autre.heureCourante * 3600 + autre.minuteCourante * 60 + autre.secondeCourante;
        return Math.abs(t1 - t2);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", heureCourante, minuteCourante, secondeCourante);
    }
}
