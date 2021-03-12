//package com.luqidoproit.educaderpro;
//
//import android.os.Bundle;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//public class contect_us_data extends AppCompatActivity {
//    //FIRST YEAR ALL
//   private TextView math,math2,physics,chemistry,graphics,program,english,electrical;
//
//   // SECOND YEAR CS
//   private TextView SOFTWARE,DATASTRC,MICRO,DLD,TUFFEL,DISCRETE,OS,MATHS3,HUMANVALUE,COA;
//
//   //SECOND YEAR ME
//    private TextView SCIENCE_ME,MATH_3_ME,TECHINAL_ME,HUMAN_ME,THERMO,FLUID,MATERIALS,APPLIED,MECHANICS,MANUFAC;
//
//    //SECOND YEAR EE
//    private TextView SCIENCE,MATH_3,TECHINAL,HUMAN,ELECTRICAL,ELECTROMAGNETIC,ELECTRONICS,MECHINES,ANALYSAS,SIGNALS;
//
//    //SECOND YEAR ECE
//    private TextView SCIENCE_ECE,MATH_3_ECE,TECHINAL_ECE,HUMAN_ECE,DSD,COMM_ENG,ELECTRONICS_ECE,CIRCUIT,ANALYSAS_ECE,SIGNAL_ECE;
//
//    //SECOND YEAR CIVIL
//    private TextView SCIENCE_CIV,MATH_3_CIV,TECHINAL_CIV,HUMAN_CIV,FLUID_CIV,MECHANICS_CIV,GEOMATICS,CONSTRUCTIONS,SOLOD,HYDRA;
//
//    //THIRD YEAR CS
//    private TextView PPL,GRAPHICS,NETWORK,WT,INDUSTRIAL,CYBER ,DBMS,ECONOMICS,COMPILER,SOCIOLOGY,DAA,DATAMINING;
//
//    //THIRD YEAR ME
//    private TextView MACHINE,HEAT,MANUFACTURING_2,IC,INDUSTRIAL_ME,CYBER_ME ,F_MACHINES,ECONOMICS_ME,MACHINE_DESIGN,SOCIOLOGY_ME,THEORY,RELIABILITY;
//
//    //THIRD YEAR CIVIL
//    private TextView GE,STRUCTURE,ESTIMATION,MC,INDUSTRIAL_CIV,CYBER_CIV ,ECO,ECONOMICS_CIV,TRANSPORT,SOCIOLOGY_CIV,FD,STRUCTURE_2;
//
//    //THIRD YEAR EE
//    private TextView MECHINES_2,PTAD,CONTROL,PSO,INDUSTRIAL_EE,CYBER_EE ,PE,ECONOMICS_EE,MICROPRO,SOCIOLOGY_EE,PSA,VOLTAGE;
//
//    //THIRD YEAR ECE
//    private TextView POC,INTEGRATED,DSP,AWP,INDUSTRIAL_ECE,CYBER_ECE ,SYSTEM_1,ECONOMICS_ECE,MICROWAVE,SOCIOLOGY_ECE,DC,ASP;
//
//
//
//
//
//   // COMMON FIRST YEAR SYLLABUS  ENGINEERING_CHEMISTRY
//    private TextView UNIT1_ENGINEERING_CHEMISTRY,UNIT2_ENGINEERING_CHEMISTRY,UNIT3_ENGINEERING_CHEMISTRY,UNIT4_ENGINEERING_CHEMISTRY,UNIT5_ENGINEERING_CHEMISTRY;
//
//
//
//    //COMMON FIRST YEAR SYLLABUS  ELECTRICAL
//    private TextView UNIT1_ELECTRICAL,UNIT2_ELECTRICAL,UNIT3_ELECTRICAL,UNIT4_ELECTRICAL,UNIT5_ELECTRICAL;
//
//
//   // COMMON FIRST YEAR SYLLABUS  PROFESSIONAL_ENGLISH
//   private TextView UNIT1_PROFESSIONAL_ENGLISH,UNIT2_PROFESSIONAL_ENGLISH,UNIT3_PROFESSIONAL_ENGLISH,UNIT4_PROFESSIONAL_ENGLISH,UNIT5_PROFESSIONAL_ENGLISH;
//
//
//
//  //COMMON FIRST YEAR SYLLABUS  GRAPHICS
//private TextView UNIT1_GRAPHICS,UNIT2_GRAPHICS,UNIT3_GRAPHICS,UNIT4_GRAPHICS,UNIT5_GRAPHICS;
//
//
//   //COMMON FIRST YEAR SYLLABUS  MATHS1
//   private TextView UNIT1_MATHS1,UNIT2_MATHS1,UNIT3_MATHS1,UNIT4_MATHS1,UNIT5_MATHS1;
//
//
//   //COMMON FIRST YEAR SYLLABUS  MATHS2
//   private TextView UNIT1_MATHS2,UNIT2_MATHS2,UNIT3_MATHS2,UNIT4_MATHS2,UNIT5_MATHS2;
//
//
//
//   // COMMON FIRST YEAR SYLLABUS  PHYSICS
//   private TextView UNIT1_PHYSICS,UNIT2_PHYSICS,UNIT3_PHYSICS,UNIT4_PHYSICS,UNIT5_PHYSICS;
//
//
//   //COMMON FIRST YEAR SYLLABUS  PROGRAMMING
//   private TextView UNIT1_PROGRAMMING,UNIT2_PROGRAMMING,UNIT3_PROGRAMMING,UNIT4_PROGRAMMING,UNIT5_PROGRAMMING;
//
//
//
//
//
//
//
//
//    private    FirebaseDatabase firebaseDatabase;
//    private DatabaseReference databaseReference, databaseReference_2CS,databaseReference_2ME,databaseReference_2CIVIL,databaseReference_2EE,databaseReference_2ECE, databaseReference_3CS,databaseReference_3ME,databaseReference_3CIVIL,databaseReference_3EE,databaseReference_3ECE,DR_syllabus_first_english,DR_syllabus_first_physics,DR_syllabus_first_programming,DR_syllabus_first_graphics,DR_syllabus_first_electrical,DR_syllabus_first_chemistry,DR_syllabus_first_m1,DR_syllabus_first_m2;
//
//
//    user user;
//    csecondpojo cssecondpojo;
//    CSthird cSthird;
//    MEsecond mEsecond;
//    MEthird mEthird;
//    EEsecond eEsecond;
//    EEthird eEthird;
//    ECEsecond ecEsecond;
//    ECEthird ecEthird;
//    CIVILsecond civiLsecond;
//    CIVILthird civiLthird;
//    syllabus_first_english syllabus_first_english;
//    syllabus_first_chemistry syllabus_first_chemistry;
//    syllabus_first_electrical syllabus_first_electrical;
//    syllabus_first_graphics syllabus_first_graphics;
//    syllabus_first_maths1 syllabus_first_maths1;
//    syllabus_first_maths2 syllabus_first_maths2;
//    syllabus_first_physics syllabus_first_physics;
//    syllabus_first_programming syllabus_first_programming;
//
//
//
//
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_send_data);
//
//        firebaseDatabase=FirebaseDatabase.getInstance();
//
//        databaseReference=firebaseDatabase.getReference("FIRST_YEAR");
//        databaseReference_2CS=firebaseDatabase.getReference("SECOND_YEAR_CS");
//        databaseReference_2ME=firebaseDatabase.getReference("SECOND_YEAR_ME");
//        databaseReference_2CIVIL=firebaseDatabase.getReference("SECOND_YEAR_CIVIL");
//        databaseReference_2EE=firebaseDatabase.getReference("SECOND_YEAR_EE");
//        databaseReference_2ECE=firebaseDatabase.getReference("SECOND_YEAR_ECE");
//        databaseReference_3CS=firebaseDatabase.getReference("THIRD_YEAR_CS");
//        databaseReference_3ME=firebaseDatabase.getReference("THIRD_YEAR_ME");
//        databaseReference_3CIVIL=firebaseDatabase.getReference("THIRD_YEAR_CIVIL");
//        databaseReference_3EE=firebaseDatabase.getReference("THIRD_YEAR_EE");
//        databaseReference_3ECE=firebaseDatabase.getReference("THIRD_YEAR_ECE");
//        DR_syllabus_first_chemistry=firebaseDatabase.getReference("FIRST_YEAR_CHEMISTRY_SYLLABUS");
//        DR_syllabus_first_electrical=firebaseDatabase.getReference("FIRST_YEAR_ELECTRICAL_SYLLABUS");
//        DR_syllabus_first_physics=firebaseDatabase.getReference("FIRST_YEAR_PHYSICS_SYLLABUS");
//        DR_syllabus_first_programming=firebaseDatabase.getReference("FIRST_YEAR_PROGRAMMING_SYLLABUS");
//        DR_syllabus_first_graphics=firebaseDatabase.getReference("FIRST_YEAR_GRAPHICS_SYLLABUS");
//        DR_syllabus_first_english=firebaseDatabase.getReference("FIRST_YEAR_ENGLISH_SYLLABUS");
//        DR_syllabus_first_m1=firebaseDatabase.getReference("FIRST_YEAR_MATHS_1_SYLLABUS");
//        DR_syllabus_first_m2=firebaseDatabase.getReference("FIRST_YEAR_MATHS_2_SYLLABUS");
//
//
//
//        //COMMON FIRST YEAR SYLLABUS  PROGRAMMING
//        UNIT1_PROGRAMMING=findViewById(R.id.UNIT1_PROGRAMMING);
//        UNIT2_PROGRAMMING=findViewById(R.id.UNIT2_PROGRAMMING);
//        UNIT3_PROGRAMMING=findViewById(R.id.UNIT3_PROGRAMMING);
//        UNIT4_PROGRAMMING=findViewById(R.id.UNIT4_PROGRAMMING);
//        UNIT5_PROGRAMMING=findViewById(R.id.UNIT5_PROGRAMMING);
//
//        // COMMON FIRST YEAR SYLLABUS  PHYSICS
//        UNIT1_PHYSICS=findViewById(R.id.UNIT1_PHYSICS);
//        UNIT2_PHYSICS=findViewById(R.id.UNIT2_PHYSICS);
//        UNIT3_PHYSICS=findViewById(R.id.UNIT3_PHYSICS);
//        UNIT4_PHYSICS=findViewById(R.id.UNIT4_PHYSICS);
//        UNIT5_PHYSICS=findViewById(R.id.UNIT5_PHYSICS);
//
//        //COMMON FIRST YEAR SYLLABUS  MATHS2
//        UNIT1_MATHS2=findViewById(R.id.UNIT1_MATHS2);
//        UNIT2_MATHS2=findViewById(R.id.UNIT2_MATHS2);
//        UNIT3_MATHS2=findViewById(R.id.UNIT3_MATHS2);
//        UNIT4_MATHS2=findViewById(R.id.UNIT4_MATHS2);
//        UNIT5_MATHS2=findViewById(R.id.UNIT5_MATHS2);
//
//        //COMMON FIRST YEAR SYLLABUS  MATHS1
//        UNIT1_MATHS1=findViewById(R.id.UNIT1_MATHS1);
//        UNIT2_MATHS1=findViewById(R.id.UNIT2_MATHS1);
//        UNIT3_MATHS1=findViewById(R.id.UNIT3_MATHS1);
//        UNIT4_MATHS1=findViewById(R.id.UNIT4_MATHS1);
//        UNIT5_MATHS1=findViewById(R.id.UNIT5_MATHS1);
//
//
//        //COMMON FIRST YEAR SYLLABUS  GRAPHICS
//        UNIT1_GRAPHICS=findViewById(R.id.UNIT1_GRAPHICS);
//        UNIT2_GRAPHICS=findViewById(R.id.UNIT2_GRAPHICS);
//        UNIT3_GRAPHICS=findViewById(R.id.UNIT3_GRAPHICS);
//        UNIT4_GRAPHICS=findViewById(R.id.UNIT4_GRAPHICS);
//        UNIT5_GRAPHICS=findViewById(R.id.UNIT5_GRAPHICS);
//
//        // COMMON FIRST YEAR SYLLABUS  ENGINEERING_CHEMISTRY
//        UNIT1_ENGINEERING_CHEMISTRY=findViewById(R.id.UNIT1_ENGINEERING_CHEMISTRY);
//        UNIT2_ENGINEERING_CHEMISTRY=findViewById(R.id.UNIT2_ENGINEERING_CHEMISTRY);
//        UNIT3_ENGINEERING_CHEMISTRY=findViewById(R.id.UNIT3_ENGINEERING_CHEMISTRY);
//        UNIT4_ENGINEERING_CHEMISTRY=findViewById(R.id.UNIT4_ENGINEERING_CHEMISTRY);
//        UNIT5_ENGINEERING_CHEMISTRY=findViewById(R.id.UNIT5_ENGINEERING_CHEMISTRY);
//
//
//        //COMMON FIRST YEAR SYLLABUS  ELECTRICAL
//        UNIT1_ELECTRICAL=findViewById(R.id.UNIT1_ELECTRICAL);
//        UNIT2_ELECTRICAL=findViewById(R.id.UNIT2_ELECTRICAL);
//        UNIT3_ELECTRICAL=findViewById(R.id.UNIT3_ELECTRICAL);
//        UNIT4_ELECTRICAL=findViewById(R.id.UNIT4_ELECTRICAL);
//        UNIT5_ELECTRICAL=findViewById(R.id.UNIT5_ELECTRICAL);
//
//        // COMMON FIRST YEAR SYLLABUS  PROFESSIONAL_ENGLISH
//        UNIT1_PROFESSIONAL_ENGLISH=findViewById(R.id.UNIT1_PROFESSIONAL_ENGLISH);
//        UNIT2_PROFESSIONAL_ENGLISH=findViewById(R.id.UNIT2_PROFESSIONAL_ENGLISH);
//        UNIT3_PROFESSIONAL_ENGLISH=findViewById(R.id.UNIT3_PROFESSIONAL_ENGLISH);
//        UNIT4_PROFESSIONAL_ENGLISH=findViewById(R.id.UNIT4_PROFESSIONAL_ENGLISH);
//        UNIT5_PROFESSIONAL_ENGLISH=findViewById(R.id.UNIT5_PROFESSIONAL_ENGLISH);
//
//
//
//
//
//        // EE third
//        MECHINES_2=findViewById(R.id.MECHINES_2);
//        PTAD=findViewById(R.id.PTAD);
//        CONTROL=findViewById(R.id.CONTROL);
//        PSO=findViewById(R.id.PSO);
//        INDUSTRIAL_EE=findViewById(R.id.INDUSTRIAL_EE);
//        CYBER_EE=findViewById(R.id.CYBER_EE);
//        PE=findViewById(R.id.PE);
//        ECONOMICS_EE=findViewById(R.id.ECONOMICS_EE);
//        MICROPRO=findViewById(R.id.MICROPRO);
//        SOCIOLOGY_EE=findViewById(R.id.SOCIOLOGY_EE);
//        PSA=findViewById(R.id.PSA);
//        VOLTAGE=findViewById(R.id.VOLTAGE);
//
//
//        // CIVIL third
//        GE=findViewById(R.id.GE);
//        STRUCTURE=findViewById(R.id.STRUCTURE);
//        ESTIMATION=findViewById(R.id.ESTIMATION);
//        MC=findViewById(R.id.MC);
//        INDUSTRIAL_CIV=findViewById(R.id.INDUSTRIAL_CIV);
//        CYBER_CIV=findViewById(R.id.CYBER_CIV);
//        ECO=findViewById(R.id.ECO);
//        ECONOMICS_CIV=findViewById(R.id.ECONOMICS_CIV);
//        TRANSPORT=findViewById(R.id.TRANSPORT);
//        SOCIOLOGY_CIV=findViewById(R.id.SOCIOLOGY_CIV);
//        FD=findViewById(R.id.FD);
//        STRUCTURE_2=findViewById(R.id.STRUCTURE_2);
//
//
//
//
//
//        // ECE third
//        POC=findViewById(R.id.POC);
//        INTEGRATED=findViewById(R.id.INTEGRATED);
//        DSP=findViewById(R.id.DSP);
//        AWP=findViewById(R.id.AWP);
//        INDUSTRIAL_ECE=findViewById(R.id.INDUSTRIAL_ECE);
//        CYBER_ECE=findViewById(R.id.CYBER_ECE);
//        SYSTEM_1=findViewById(R.id.SYSTEM_1);
//        ECONOMICS_ECE=findViewById(R.id.ECONOMICS_ECE);
//        MICROWAVE=findViewById(R.id.MICROWAVE);
//        SOCIOLOGY_ECE=findViewById(R.id.SOCIOLOGY_ECE);
//        DC=findViewById(R.id.DC);
//        ASP=findViewById(R.id.ASP);
//
//
//
//
//
//
//        // cs third
//        PPL=findViewById(R.id.PPL);
//        GRAPHICS=findViewById(R.id.GRAPHICS);
//        NETWORK=findViewById(R.id.NETWORK);
//        WT=findViewById(R.id.WT);
//        INDUSTRIAL=findViewById(R.id.INDUSTRIAL);
//        CYBER=findViewById(R.id.CYBER);
//        DBMS=findViewById(R.id.DBMS);
//        ECONOMICS=findViewById(R.id.ECONOMICS);
//        COMPILER=findViewById(R.id.COMPILER);
//        SOCIOLOGY=findViewById(R.id.SOCIOLOGY);
//        DAA=findViewById(R.id.DAA);
//        DATAMINING=findViewById(R.id.DATAMINING);
//
//
//
//        //Me third
//        MACHINE=findViewById(R.id.MACHINE);
//        HEAT=findViewById(R.id.HEAT);
//        MANUFACTURING_2=findViewById(R.id.MANUFACTURING_2);
//        IC=findViewById(R.id.IC);
//        INDUSTRIAL_ME=findViewById(R.id.INDUSTRIAL_ME);
//        CYBER_ME=findViewById(R.id.CYBER_ME);
//        F_MACHINES=findViewById(R.id.F_MACHINES);
//        ECONOMICS_ME=findViewById(R.id.ECONOMICS_ME);
//        MACHINE_DESIGN=findViewById(R.id.MACHINE_DESIGN);
//        SOCIOLOGY_ME=findViewById(R.id.SOCIOLOGY_ME);
//        THEORY=findViewById(R.id.THEORY);
//        RELIABILITY=findViewById(R.id.RELIABILITY);
//
//
//
//
//
//
//
//
//
////civil second
//        SCIENCE_CIV=findViewById(R.id.SCIENCE_CIV);
//        MATH_3_CIV=findViewById(R.id.MATH_3_CIV);
//        TECHINAL_CIV=findViewById(R.id.TECHINAL_CIV);
//        HUMAN_CIV=findViewById(R.id.HUMAN_CIV);
//        FLUID_CIV=findViewById(R.id.FLUID_CIV);
//        MECHANICS_CIV=findViewById(R.id.MECHANICS_CIV);
//        GEOMATICS=findViewById(R.id.GEOMATICS);
//        CONSTRUCTIONS=findViewById(R.id.CONSTRUCTIONS);
//        SOLOD=findViewById(R.id.SOLOD);
//        HYDRA=findViewById(R.id.HYDRA);
//
//
//
//
////cs second
//        SOFTWARE=findViewById(R.id.SOFTWARE);
//        DATASTRC=findViewById(R.id.DATASTRC);
//        MICRO=findViewById(R.id.MICRO);
//        DLD=findViewById(R.id.DLD);
//        TUFFEL=findViewById(R.id.TUFFEL);
//        DISCRETE=findViewById(R.id.DISCRETE);
//        OS=findViewById(R.id.OS);
//        MATHS3=findViewById(R.id.MATHS3);
//        HUMANVALUE=findViewById(R.id.HUMANVALUE);
//        COA=findViewById(R.id.COA);
//
//
//
////me second
//
//        SCIENCE_ME=findViewById(R.id.SCIENCE_ME);
//        MATH_3_ME=findViewById(R.id.MATH_3_ME);
//        TECHINAL_ME=findViewById(R.id.TECHINAL_ME);
//        HUMAN_ME=findViewById(R.id.HUMAN_ME);
//        THERMO=findViewById(R.id.THERMO);
//        FLUID=findViewById(R.id.FLUID);
//        MATERIALS=findViewById(R.id.MATERIALS);
//        APPLIED=findViewById(R.id.APPLIED);
//        MECHANICS=findViewById(R.id.MECHANICS);
//        MANUFAC=findViewById(R.id.MANUFAC);
//
//
//
//
////ee second
//        SCIENCE=findViewById(R.id.SCIENCE);
//        MATH_3=findViewById(R.id.MATH_3);
//        TECHINAL=findViewById(R.id.TECHINAL);
//        HUMAN=findViewById(R.id.HUMAN);
//        ELECTRICAL=findViewById(R.id.ELECTRICAL);
//        ELECTROMAGNETIC=findViewById(R.id.ELECTROMAGNETIC);
//        ELECTRONICS=findViewById(R.id.ELECTRONICS);
//        MECHINES=findViewById(R.id.MECHINES);
//        ANALYSAS=findViewById(R.id.ANALYSAS);
//        SIGNALS=findViewById(R.id.SIGNALS);
//
//
//
//
//
//
////ece second
//        SCIENCE_ECE=findViewById(R.id.SCIENCE_ECE);
//        MATH_3_ECE=findViewById(R.id.MATH_3_ECE);
//        TECHINAL_ECE=findViewById(R.id.TECHINAL_ECE);
//        HUMAN_ECE=findViewById(R.id.HUMAN_ECE);
//        DSD=findViewById(R.id.DSD);
//        COMM_ENG=findViewById(R.id.COMM_ENG);
//        ELECTRONICS_ECE=findViewById(R.id.ELECTRONICS_ECE);
//        CIRCUIT=findViewById(R.id.CIRCUIT);
//        ANALYSAS_ECE=findViewById(R.id.ANALYSAS_ECE);
//        SIGNAL_ECE=findViewById(R.id.SIGNAL_ECE);
//
//
////first year complete
//        math=findViewById(R.id.math);
//        math2=findViewById(R.id.math2);
//        physics=findViewById(R.id.physics);
//        chemistry=findViewById(R.id.chemistry);
//        graphics=findViewById(R.id.graphics);
//        program=findViewById(R.id.program);
//        electrical=findViewById(R.id.electrical);
//        english=findViewById(R.id.english);
//
//
//
//
//        user=new user();
//        cssecondpojo=new csecondpojo();
//        cSthird=new CSthird();
//        civiLsecond=new CIVILsecond();
//        civiLthird=new CIVILthird();
//        mEsecond=new MEsecond();
//        mEthird=new MEthird();
//        ecEthird=new ECEthird();
//        ecEsecond=new ECEsecond();
//        eEsecond=new EEsecond();
//        eEthird=new EEthird();
//        syllabus_first_graphics=new syllabus_first_graphics();
//        syllabus_first_programming=new syllabus_first_programming();
//        syllabus_first_physics=new syllabus_first_physics();
//        syllabus_first_maths2=new syllabus_first_maths2();
//        syllabus_first_maths1=new syllabus_first_maths1();
//        syllabus_first_electrical=new syllabus_first_electrical();
//        syllabus_first_chemistry=new syllabus_first_chemistry();
//        syllabus_first_english=new syllabus_first_english();
//
//
//
//
//
//        databaseReference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getValues();
//                databaseReference.child("COMMON FOR ALL BRANCHES").setValue(user);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//
//
//
//
//
//
//
//        databaseReference_2EE.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getEEii();
//               databaseReference_2EE.child("EE").setValue(eEsecond);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//
//       databaseReference_3EE.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getEEiii();
//               databaseReference_3EE.child("EE").setValue(eEthird);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//
//
//
//
//
//
//       databaseReference_2ECE.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getECEii();
//               databaseReference_2ECE.child("ECE").setValue(ecEsecond);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//       databaseReference_3ECE.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getECEiii();
//               databaseReference_3ECE.child("ECE").setValue(ecEthird);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//
//
//
//
//
//       databaseReference_2ME.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getMEii();
//               databaseReference_2ME.child("ME").setValue(mEsecond);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//       databaseReference_3ME.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getMEiii();
//               databaseReference_3ME.child("ME").setValue(mEthird);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//
//
//
//
//
//
//
//
//       databaseReference_2CIVIL.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getCIVILii();
//               databaseReference_2CIVIL.child("CIVIL").setValue(civiLsecond);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//       databaseReference_3CIVIL.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getCIVILiii();
//               databaseReference_3CIVIL.child("CIVIL").setValue(civiLthird);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//
//
//
//
//
//
//        databaseReference_3CS.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getCSiii();
//                databaseReference_3CS.child("CSE").setValue(cSthird);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//       databaseReference_2CS.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//              getCSii();
//              databaseReference_2CS.child("CSE").setValue(cssecondpojo);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//
//
//
//
//
//       DR_syllabus_first_chemistry.addValueEventListener(new ValueEventListener() {
//           @Override
//           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//               getSyllabusFirstChemistry();
//             DR_syllabus_first_chemistry.child("CHEMISTRY") .setValue(syllabus_first_chemistry);
//           }
//
//           @Override
//           public void onCancelled(@NonNull DatabaseError databaseError) {
//
//           }
//       });
//
//
//        DR_syllabus_first_physics.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getSyllabusFirstPhysics();
//                DR_syllabus_first_physics.child("PHYSICS") .setValue(syllabus_first_physics);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//        DR_syllabus_first_programming.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getSyllabusFirstProgramming();
//                DR_syllabus_first_programming.child("PROGRAMMING") .setValue(syllabus_first_programming);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//        DR_syllabus_first_electrical.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getSyllabusFirstElectrical();
//                DR_syllabus_first_electrical.child("ELECTRICAL") .setValue(syllabus_first_electrical);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//        DR_syllabus_first_english.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getSyllabusFirstEnglish();
//                DR_syllabus_first_english.child("ENGLISH") .setValue(syllabus_first_english);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//        DR_syllabus_first_m2.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getSyllabusFirstMaths2();
//                DR_syllabus_first_m2.child("MATHS_2") .setValue(syllabus_first_maths2);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//        DR_syllabus_first_m1.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getSyllabusFirstMaths1();
//                DR_syllabus_first_m1.child("MATHS_1") .setValue(syllabus_first_maths1);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//
//        DR_syllabus_first_graphics.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                getSyllabusFirstGraphics();
//                DR_syllabus_first_graphics.child("GRAPHICS") .setValue(syllabus_first_graphics);
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//
//    }
//
//
//
//
//
//
//    private void getValues()
//    {
//      user.setMath(math.getText().toString());
//      user.setMaths2(math2.getText().toString());
//        user.setChemistry(chemistry.getText().toString());
//        user.setElectrical(electrical.getText().toString());
//        user.setEnglish(english.getText().toString());
//        user.setPhysics(physics.getText().toString());
//        user.setProgram(program.getText().toString());
//        user.setGraphics(graphics.getText().toString());
//    }
//
//
//    private void getCSii()
//    {
//        cssecondpojo.setCOA(COA.getText().toString());
//        cssecondpojo.setDATASTRC(DATASTRC.getText().toString());
//        cssecondpojo.setDISCRETE(DISCRETE.getText().toString());
//        cssecondpojo.setDLD(DLD.getText().toString());
//        cssecondpojo.setHUMANVALUE(HUMAN.getText().toString());
//        cssecondpojo.setMATHS3(MATH_3.getText().toString());
//        cssecondpojo.setMICRO(MICRO.getText().toString());
//        cssecondpojo.setSOFTWARE(SOFTWARE.getText().toString());
//        cssecondpojo.setTUFFEL(TUFFEL.getText().toString());
//        cssecondpojo.setOS(OS.getText().toString());
//
//    }
//
//    private void getCSiii(){
//        cSthird.setCOMPILER(COMPILER.getText().toString());
//        cSthird.setCYBER(CYBER.getText().toString());
//        cSthird.setDAA(DAA.getText().toString());
//        cSthird.setDATAMINING(DATAMINING.getText().toString());
//        cSthird.setDBMS(DBMS.getText().toString());
//        cSthird.setECONOMICS(ECONOMICS.getText().toString());
//        cSthird.setINDUSTRIAL(INDUSTRIAL.getText().toString());
//        cSthird.setSOCIOLOGY(SOCIOLOGY.getText().toString());
//        cSthird.setPPL(PPL.getText().toString());
//        cSthird.setWT(WT.getText().toString());
//        cSthird.setNETWORK(NETWORK.getText().toString());
//        cSthird.setGRAPHICS(GRAPHICS.getText().toString());
//
//    }
//
//    private void getMEii(){
//        mEsecond.setHUMAN_ME(HUMAN_ME.getText().toString());
//        mEsecond.setAPPLIED(APPLIED.getText().toString());
//        mEsecond.setFLUID(FLUID.getText().toString());
//        mEsecond.setMANUFAC(MANUFAC.getText().toString());
//        mEsecond.setMATERIALS(MATERIALS.getText().toString());
//        mEsecond.setMATH_3_ME(MATH_3_ME.getText().toString());
//        mEsecond.setMECHANICS(MECHANICS.getText().toString());
//        mEsecond.setSCIENCE_ME(SCIENCE_ME.getText().toString());
//        mEsecond.setTECHINAL_ME(TECHINAL_ME.getText().toString());
//        mEsecond.setTHERMO(THERMO.getText().toString());
//
//
//
//    }
//    private void getMEiii(){
//        mEthird.setCYBER_ME(CYBER_ME.getText().toString());
//        mEthird.setECONOMICS_ME(ECONOMICS_ME.getText().toString());
//        mEthird.setF_MACHINES(F_MACHINES.getText().toString());
//        mEthird.setHEAT(HEAT.getText().toString());
//        mEthird.setIC(IC.getText().toString());
//        mEthird.setINDUSTRIAL_ME(INDUSTRIAL_ME.getText().toString());
//        mEthird.setMACHINE(MACHINE.getText().toString());
//        mEthird.setMACHINE_DESIGN(MACHINE_DESIGN.getText().toString());
//        mEthird.setMANUFACTURING_2(MANUFACTURING_2.getText().toString());
//        mEthird.setRELIABILITY(RELIABILITY.getText().toString());
//        mEthird.setSOCIOLOGY_ME(SOCIOLOGY_ME.getText().toString());
//        mEthird.setTHEORY(THEORY.getText().toString());
//
//
//    }
//
//    private void getCIVILii(){
//        civiLsecond.setCONSTRUCTIONS(CONSTRUCTIONS.getText().toString());
//        civiLsecond.setHYDRA(HYDRA.getText().toString());
//        civiLsecond.setGEOMATICS(GEOMATICS.getText().toString());
//        civiLsecond.setSOLOD(SOLOD.getText().toString());
//        civiLsecond.setFLUID_CIV(FLUID_CIV.getText().toString());
//        civiLsecond.setHUMAN_CIV(HUMAN_CIV.getText().toString());
//        civiLsecond.setMATH_3_CIV(MATH_3_CIV.getText().toString());
//        civiLsecond.setMECHANICS_CIV(MECHANICS_CIV.getText().toString());
//        civiLsecond.setSCIENCE_CIV(SCIENCE_CIV.getText().toString());
//        civiLsecond.setTECHINAL_CIV(TECHINAL_CIV.getText().toString());
//
//    }
//    private void getCIVILiii(){
//        civiLthird.setCYBER_CIV(CYBER_CIV.getText().toString());
//        civiLthird.setECO(ECO.getText().toString());
//        civiLthird.setECONOMICS_CIV(ECONOMICS_CIV.getText().toString());
//        civiLthird.setESTIMATION(ESTIMATION.getText().toString());
//        civiLthird.setFD(FD.getText().toString());
//        civiLthird.setGE(GE.getText().toString());
//        civiLthird.setINDUSTRIAL_CIV(INDUSTRIAL_CIV.getText().toString());
//        civiLthird.setMC(MC.getText().toString());
//        civiLthird.setSOCIOLOGY_CIV(SOCIOLOGY_CIV.getText().toString());
//        civiLthird.setSTRUCTURE(STRUCTURE.getText().toString());
//        civiLthird.setSTRUCTURE_2(STRUCTURE_2.getText().toString());
//        civiLthird.setTRANSPORT(TRANSPORT.getText().toString());
//
//    }
//    private void getEEii(){
//        eEsecond.setANALYSAS(ANALYSAS.getText().toString());
//        eEsecond.setELECTRICAL(ELECTRICAL.getText().toString());
//        eEsecond.setELECTROMAGNETIC(ELECTROMAGNETIC.getText().toString());
//        eEsecond.setELECTRONICS(ELECTRONICS.getText().toString());
//        eEsecond.setHUMAN(HUMAN.getText().toString());
//        eEsecond.setMATH_3(MATH_3.getText().toString());
//        eEsecond.setMECHINES(MECHINES.getText().toString());
//        eEsecond.setSCIENCE(SCIENCE.getText().toString());
//        eEsecond.setSIGNALS(SIGNALS.getText().toString());
//        eEsecond.setTECHINAL(TECHINAL.getText().toString());
//
//    }
//    private void getEEiii(){
//        eEthird.setCONTROL(CONTROL.getText().toString());
//        eEthird.setCYBER_EE(CYBER_EE.getText().toString());
//        eEthird.setECONOMICS_EE(ECONOMICS_EE.getText().toString());
//        eEthird.setINDUSTRIAL_EE(INDUSTRIAL_EE.getText().toString());
//        eEthird.setMECHINES_2(MECHINES_2.getText().toString());
//        eEthird.setMICROPRO(MICROPRO.getText().toString());
//        eEthird.setPE(PE.getText().toString());
//        eEthird.setPSA(PSA.getText().toString());
//        eEthird.setPSO(PSO.getText().toString());
//        eEthird.setPTAD(PTAD.getText().toString());
//        eEthird.setVOLTAGE(VOLTAGE.getText().toString());
//        eEthird.setSOCIOLOGY_EE(SOCIOLOGY_EE.getText().toString());
//
//    }
//
//    private void getECEii(){
//        ecEsecond.setANALYSAS_ECE(ANALYSAS_ECE.getText().toString());
//        ecEsecond.setCIRCUIT(CIRCUIT.getText().toString());
//        ecEsecond.setCOMM_ENG(COMM_ENG.getText().toString());
//        ecEsecond.setDSD(DSD.getText().toString());
//        ecEsecond.setELECTRONICS_ECE(ELECTRONICS_ECE.getText().toString());
//        ecEsecond.setHUMAN_ECE(HUMAN_ECE.getText().toString());
//        ecEsecond.setMATH_3_ECE(MATH_3_ECE.getText().toString());
//        ecEsecond.setSCIENCE_ECE(SCIENCE_ECE.getText().toString());
//        ecEsecond.setSIGNAL_ECE(SIGNAL_ECE.getText().toString());
//        ecEsecond.setTECHINAL_ECE(TECHINAL_ECE.getText().toString());
//
//    }
//    private void getECEiii(){
//        ecEthird.setASP(ASP.getText().toString());
//        ecEthird.setAWP(AWP.getText().toString());
//        ecEthird.setDC(DC.getText().toString());
//        ecEthird.setINTEGRATED(INTEGRATED.getText().toString());
//        ecEthird.setDSP(DSP.getText().toString());
//        ecEthird.setMICROWAVE(MICROWAVE.getText().toString());
//        ecEthird.setPOC(POC.getText().toString());
//        ecEthird.setCYBER_ECE(CYBER_ECE.getText().toString());
//        ecEthird.setINDUSTRIAL_ECE(INDUSTRIAL_ECE.getText().toString());
//        ecEthird.setECONOMICS_ECE(ECONOMICS_ECE.getText().toString());
//        ecEthird.setSOCIOLOGY_ECE(SOCIOLOGY_ECE.getText().toString());
//        ecEthird.setSYSTEM_1(SYSTEM_1.getText().toString());
//    }
//
//    private void getSyllabusFirstChemistry(){
//        syllabus_first_chemistry.setUNIT1_ENGINEERING_CHEMISTRY(UNIT1_ENGINEERING_CHEMISTRY.getText().toString());
//        syllabus_first_chemistry.setUNIT2_ENGINEERING_CHEMISTRY(UNIT2_ENGINEERING_CHEMISTRY.getText().toString());
//        syllabus_first_chemistry.setUNIT3_ENGINEERING_CHEMISTRY(UNIT3_ENGINEERING_CHEMISTRY.getText().toString());
//        syllabus_first_chemistry.setUNIT4_ENGINEERING_CHEMISTRY(UNIT4_ENGINEERING_CHEMISTRY.getText().toString());
//        syllabus_first_chemistry.setUNIT5_ENGINEERING_CHEMISTRY(UNIT5_ENGINEERING_CHEMISTRY.getText().toString());
//    }
//
//
//    private void getSyllabusFirstPhysics(){
//        syllabus_first_physics.setUNIT1_PHYSICS(UNIT1_PHYSICS.getText().toString());
//        syllabus_first_physics.setUNIT2_PHYSICS(UNIT2_PHYSICS.getText().toString());
//        syllabus_first_physics.setUNIT3_PHYSICS(UNIT3_PHYSICS.getText().toString());
//        syllabus_first_physics.setUNIT4_PHYSICS(UNIT4_PHYSICS.getText().toString());
//        syllabus_first_physics.setUNIT5_PHYSICS(UNIT5_PHYSICS.getText().toString());
//    }
//
//
//    private void getSyllabusFirstProgramming(){
//        syllabus_first_programming.setUNIT1_PROGRAMMING(UNIT1_PROGRAMMING.getText().toString());
//        syllabus_first_programming.setUNIT2_PROGRAMMING(UNIT2_PROGRAMMING.getText().toString());
//        syllabus_first_programming.setUNIT3_PROGRAMMING(UNIT3_PROGRAMMING.getText().toString());
//        syllabus_first_programming.setUNIT4_PROGRAMMING(UNIT4_PROGRAMMING.getText().toString());
//        syllabus_first_programming.setUNIT5_PROGRAMMING(UNIT5_PROGRAMMING.getText().toString());
//    }
//
//
//
//
//    private void getSyllabusFirstElectrical(){
//        syllabus_first_electrical.setUNIT1_ELECTRICAL(UNIT1_ELECTRICAL.getText().toString());
//        syllabus_first_programming.setUNIT2_PROGRAMMING(UNIT2_ELECTRICAL.getText().toString());
//        syllabus_first_programming.setUNIT3_PROGRAMMING(UNIT3_ELECTRICAL.getText().toString());
//        syllabus_first_programming.setUNIT4_PROGRAMMING(UNIT4_ELECTRICAL.getText().toString());
//        syllabus_first_programming.setUNIT5_PROGRAMMING(UNIT5_ELECTRICAL.getText().toString());
//    }
//
//
//    private void getSyllabusFirstEnglish(){
//        syllabus_first_english.setUNIT1_PROFESSIONAL_ENGLISH(UNIT1_PROFESSIONAL_ENGLISH.getText().toString());
//        syllabus_first_english.setUNIT2_PROFESSIONAL_ENGLISH(UNIT2_PROFESSIONAL_ENGLISH.getText().toString());
//        syllabus_first_english.setUNIT3_PROFESSIONAL_ENGLISH(UNIT3_PROFESSIONAL_ENGLISH.getText().toString());
//        syllabus_first_english.setUNIT4_PROFESSIONAL_ENGLISH(UNIT4_PROFESSIONAL_ENGLISH.getText().toString());
//        syllabus_first_english.setUNIT5_PROFESSIONAL_ENGLISH(UNIT5_PROFESSIONAL_ENGLISH.getText().toString());
//    }
//
//
//    private void getSyllabusFirstMaths1(){
//        syllabus_first_maths1.setUNIT1_MATHS1(UNIT1_MATHS1.getText().toString());
//        syllabus_first_maths1.setUNIT2_MATHS1(UNIT2_MATHS1.getText().toString());
//        syllabus_first_maths1.setUNIT3_MATHS1(UNIT3_MATHS1.getText().toString());
//        syllabus_first_maths1.setUNIT4_MATHS1(UNIT4_MATHS1.getText().toString());
//        syllabus_first_maths1.setUNIT5_MATHS1(UNIT5_MATHS1.getText().toString());
//    }
//
//    private void getSyllabusFirstMaths2(){
//        syllabus_first_maths2.setUNIT1_MATHS2(UNIT1_MATHS2.getText().toString());
//        syllabus_first_maths2.setUNIT2_MATHS2(UNIT2_MATHS2.getText().toString());
//        syllabus_first_maths2.setUNIT3_MATHS2(UNIT3_MATHS2.getText().toString());
//        syllabus_first_maths2.setUNIT4_MATHS2(UNIT4_MATHS2.getText().toString());
//        syllabus_first_maths2.setUNIT5_MATHS2(UNIT5_MATHS2.getText().toString());
//    }
//
//    private void getSyllabusFirstGraphics(){
//        syllabus_first_graphics.setUNIT1_GRAPHICS(UNIT1_GRAPHICS.getText().toString());
//        syllabus_first_graphics.setUNIT2_GRAPHICS(UNIT2_GRAPHICS.getText().toString());
//        syllabus_first_graphics.setUNIT3_GRAPHICS(UNIT3_GRAPHICS.getText().toString());
//        syllabus_first_graphics.setUNIT4_GRAPHICS(UNIT4_GRAPHICS.getText().toString());
//        syllabus_first_graphics.setUNIT5_GRAPHICS(UNIT5_GRAPHICS.getText().toString());
//    }
//
//
//
//}
