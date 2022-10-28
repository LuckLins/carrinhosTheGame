package carrinhos.carrinhosthegame;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;


public class CRUD {
    boolean cadastrado=false;
    boolean jaCadastrado=false;
    int vito=0;
    int dero=0;
    
    public void cadastro(String username, String name, String email, String senha){
        MongoClient mongo = new MongoClient("localhost",27017);
        MongoDatabase db = mongo.getDatabase("carrinhosTheGame");
        MongoCollection<Document>docs=db.getCollection("jogador");
        
        Document doc = new Document();
        doc.append("Username",username);
        doc.append("Nome",name);
        doc.append("Email",email);
        doc.append("Senha",senha);
        docs.insertOne(doc);
    }
  public void updateValues(){
        System.out.println("updateValues");
        MongoClient mongo = new MongoClient("localhost",27017);
        MongoDatabase db = mongo.getDatabase("carrinhosTheGame");
        MongoCollection<Document>docs=db.getCollection("personagens");
        
        docs.updateOne(Filters.eq("nome","Tonny Tunado"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Tonny Tunado"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","kombo"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","kombo"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Cris Crash"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Cris Crash"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Campeão"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Campeão"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Victor"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Victor"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Simone"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Simone"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome",/*"Tobias"*/"Ed Willis"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome",/*"Tobias"*/"Ed Willis"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Michael Chumassa"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Michael Chumassa"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome",/*"Akira"*/"Bio Dynamo"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome",/*"Akira"*/"Bio Dynamo"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Pé Grande"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Pé Grande"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Bongo"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Bongo"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","MC Carrius"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","MC Carrius"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","MC Truta"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","MC Truta"),Updates.set("Derrotas",0));
        docs.updateOne(Filters.eq("nome","Senhor V8"),Updates.set("Vitorias",0));
        docs.updateOne(Filters.eq("nome","Senhor V8"),Updates.set("Derrotas",0));
        
        System.out.println("Documento teve sucesso no update...");
        for(Document doc : docs.find()){
            System.out.println("item update: "+doc);
        }
    }
    public void verifyAcc(String Username){
        MongoClient mongo = new MongoClient("localhost",27017);
        MongoDatabase db = mongo.getDatabase("carrinhosTheGame");
        MongoCollection<Document>docs=db.getCollection("jogador");
        
        for(Document doc : docs.find()){
            if(doc.containsValue(Username)){
            cadastrado = true;
            break;
        }
    }
    }
    public void confirmaConta(String Username,String senha){
        MongoClient mongo = new MongoClient("localhost",27017);
        MongoDatabase db = mongo.getDatabase("carrinhosTheGame");
        MongoCollection<Document>docs=db.getCollection("jogador");
        
        for(Document doc : docs.find()){
            if(doc.containsValue(Username) && doc.containsValue(senha)){
            jaCadastrado = true;
            break;
            }
        }
    }
    public void atualizarVitBanco(String nome,int valorVit){
        System.out.println("updateValues");
        MongoClient mongo = new MongoClient("localhost",27017);
        MongoDatabase db = mongo.getDatabase("carrinhosTheGame");
        MongoCollection<Document>docs=db.getCollection("personagens");
        
        docs.updateOne(Filters.eq("nome",nome),Updates.set("Vitorias",valorVit));
    }
    public void atualizarDeroBanco(String nome,int valorDero){
        System.out.println("updateValues");
        MongoClient mongo = new MongoClient("localhost",27017);
        MongoDatabase db = mongo.getDatabase("carrinhosTheGame");
        MongoCollection<Document>docs=db.getCollection("personagens");
        
        docs.updateOne(Filters.eq("nome",nome),Updates.set("Derrotas",valorDero));
    }
    public void atualizarValIG(String nome,int vitor,int deror){
        System.out.println("updateValues");
        MongoClient mongo = new MongoClient("localhost",27017);
        MongoDatabase db = mongo.getDatabase("carrinhosTheGame");
        MongoCollection<Document>docs=db.getCollection("personagens");
        
        for(Document doc : docs.find()){
            if(doc.containsValue(nome)){
                vito=vitor;
                dero=deror;
            }
            }
        }

}
    

