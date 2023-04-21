import sun.lwawt.macosx.CSystemTray;

public class judgment {

    private int _year;

    public judgment(int _year) {
        this._year = _year;
    }

    //方法1：switch选择
    public void confirmZodiac_switch() {
        char zodiac = '空';
        switch (_year%12)
        {
            case 0:
                zodiac = '猴';
                break;
            case 1:
                zodiac = '鸡';
                break;
            case 2:
                zodiac = '狗';
                break;
            case 3:
                zodiac = '猪';
                break;
            case 4:
                zodiac = '鼠';
                break;
            case 5:
                zodiac = '牛';
                break;
            case 6:
                zodiac = '虎';
                break;
            case 7:
                zodiac = '兔';
                break;
            case 8:
                zodiac = '龙';
                break;
            case 9:
                zodiac = '蛇';
                break;
            case 10:
                zodiac = '马';
                break;
            case 11:
                zodiac = '羊';
                break;

            default:
                break;
        }

        System.out.println(_year+"年出生的人生肖为："+zodiac);

    }

    //方法2：列表
    public void confirmZodiac_list()
    {
        char[] zodiacList = {'猴','鸡','狗','猪','鼠','牛','虎','兔','龙','蛇','马','羊'};

        //遍历循环,O(n)
        for (int i=0;i<zodiacList.length;i++)
        {
            int year = this._year%12;
            if(zodiacList[year] == zodiacList[i])
            {
                System.out.println(_year+"年出生的人生肖为："+zodiacList[year]);
                break;
            }
        }
    }
}