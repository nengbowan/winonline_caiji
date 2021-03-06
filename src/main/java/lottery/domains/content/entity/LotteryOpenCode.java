 package lottery.domains.content.entity;

 import java.io.Serializable;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.Table;

















 @Entity
 @Table(name="lottery_open_code", catalog="ecai", uniqueConstraints={@javax.persistence.UniqueConstraint(columnNames={"lottery", "expect", "user_id"})})
 public class LotteryOpenCode
   implements Serializable
 {
   private static final long serialVersionUID = 1L;
   private Integer id;
   private Integer userId;
   private String lottery;
   private String expect;
   private String code;
   private String time;
   private String interfaceTime;
   private Integer openStatus;
   private String openTime;
   private String remarks;

   public LotteryOpenCode() {}

   public LotteryOpenCode(String lottery, String expect, String code, String time, Integer openStatus)
   {
     this.lottery = lottery;
     this.expect = expect;
     this.code = code;
     this.time = time;
     this.openStatus = openStatus;
   }


   public LotteryOpenCode(String lottery, String expect, String code, String time, Integer openStatus, String openTime, String remarks)
   {
     this.lottery = lottery;
     this.expect = expect;
     this.code = code;
     this.time = time;
     this.openStatus = openStatus;
     this.openTime = openTime;
     this.remarks = remarks;
   }

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id", unique=true, nullable=false)
   public Integer getId()
   {
     return this.id;
   }

   public void setId(Integer id) {
     this.id = id;
   }

   @Column(name="user_id")
   public Integer getUserId() {
     return this.userId;
   }

   public void setUserId(Integer userId) {
     this.userId = userId;
   }

   @Column(name="lottery", nullable=false, length=32)
   public String getLottery() {
     return this.lottery;
   }

   public void setLottery(String lottery) {
     this.lottery = lottery;
   }

   @Column(name="expect", nullable=false, length=32)
   public String getExpect() {
     return this.expect;
   }

   public void setExpect(String expect) {
     this.expect = expect;
   }

   @Column(name="code", nullable=false, length=128)
   public String getCode() {
     return this.code;
   }

   public void setCode(String code) {
     this.code = code;
   }

   @Column(name="time", nullable=false, length=19)
   public String getTime() {
     return this.time;
   }

   public void setTime(String time) {
     this.time = time;
   }

   @Column(name="interface_time", nullable=false, length=19)
   public String getInterfaceTime() {
     return this.interfaceTime;
   }

   public void setInterfaceTime(String interfaceTime) {
     this.interfaceTime = interfaceTime;
   }

   @Column(name="open_status", nullable=false)
   public Integer getOpenStatus() {
     return this.openStatus;
   }

   public void setOpenStatus(Integer openStatus) {
     this.openStatus = openStatus;
   }

   @Column(name="open_time")
   public String getOpenTime() {
     return this.openTime;
   }

   public void setOpenTime(String openTime) {
     this.openTime = openTime;
   }

   @Column(name="remarks", length=128)
   public String getRemarks() {
     return this.remarks;
   }

   public void setRemarks(String remarks) {
     this.remarks = remarks;
   }
 }


/* Location:              /Users/vincent/Downloads/至尊程序/lotteryCapture/lotteryCaptureRepair.jar!/lottery/domains/content/entity/LotteryOpenCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */